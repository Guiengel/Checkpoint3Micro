
# Checkpoint3Micro — Sistema de Consultas Médicas

Este projeto é um sistema simples de agendamento e controle de *consultas médicas, desenvolvido usando **Spring Boot. Ele segue uma arquitetura típica de aplicações RESTful, organizando suas responsabilidades em **controladores, **modelos, **DTOs* e *repositórios*.

---

## 📚 Explicação do Código

### Checkpoint1Application.java
Este é o ponto de entrada da aplicação, onde o Spring Boot é iniciado.

java
@SpringBootApplication
public class Checkpoint1Application {
    public static void main(String[] args) {
        SpringApplication.run(Checkpoint1Application.class, args);
    }
}

## 🧩 Camada Controller (controller/)

Contém as classes responsáveis por receber e tratar requisições HTTP (API REST).

### Exemplos:

#### PacienteController.java
Lida com as rotas relacionadas a pacientes:

- GET /pacientes → Lista todos os pacientes  
- POST /pacientes → Cadastra um novo paciente  
- PUT /pacientes/{id} → Atualiza os dados de um paciente  
- DELETE /pacientes/{id} → Remove um paciente  

#### ProfissionalController.java
Lida com as rotas dos profissionais da saúde (médicos, enfermeiros etc.):

- GET /profissionais  
- POST /profissionais  
- PUT /profissionais/{id}  
- DELETE /profissionais/{id}  

#### ConsultaController.java
Lida com o agendamento e alteração de consultas:

- GET /consultas  
- POST /consultas  
- PUT /consultas/{id}  
- DELETE /consultas/{id}  

---

## 📦 Camada DTO (dto/)

DTOs (*Data Transfer Objects*) são usados para enviar e receber dados da API, protegendo os modelos de domínio.

- ConsultaRequestCreate.java → Define os dados necessários para criar uma consulta  
- ConsultaRequestUpdate.java → Define os dados que podem ser atualizados em uma consulta  

Esses arquivos facilitam a *validação e controle de entrada/saída* de dados via API.

---

## 🧬 Camada Model (model/)

Contém as entidades JPA que representam tabelas no banco de dados.

- Paciente.java → Representa a tabela de pacientes  
- Profissional.java → Representa a tabela de profissionais da saúde  
- Consulta.java → Representa as consultas realizadas  

Cada classe possui anotações como:

- @Entity  
- @Id  
- @GeneratedValue  
- @ManyToOne  

Essas anotações mapeiam os relacionamentos e estruturas no banco de dados.

---

## 💾 Camada Repository (repository/)

Contém interfaces que estendem JpaRepository, facilitando a manipulação dos dados:

java
public interface PacienteRepository extends JpaRepository<Paciente, Long> {}

Isso permite o uso direto de métodos como:

- `findAll()`
- `save()`
- `findById()`
- `deleteById()`


Sem necessidade de SQL manual.

---

## 🛠️ Outras Pastas Importantes

- *resources/application.properties*  
  Arquivo de configurações da aplicação (porta, banco de dados, etc.)

- *.mvnw e pom.xml*  
  Utilizados para gerenciamento de dependências e build com Maven

---

## ▶️ Como Executar o Projeto

Certifique-se de ter o *Java 17+* e o *Maven* instalados.

Configure seu banco de dados no arquivo:  
src/main/resources/application.properties

No terminal, execute:

*Linux/macOS:*
bash

```
docker run -d \
    --name mysql \
    --rm \
    -e MYSQL_ROOT_PASSWORD=root_pwd \
    -e MYSQL_USER=new_user \
    -e MYSQL_PASSWORD=my_pwd \
    -p 3306:3306 \
    mysql

```
```
./mvnw spring-boot:run
```
## 🧪 Funcionalidades da API

- ✅ Cadastro, edição, listagem e remoção de *Pacientes*
- ✅ Cadastro e manutenção de *Profissionais*
- ✅ Registro e alteração de *Consultas médicas*
- ✅ Integração com banco de dados via *JPA*

---

## ✅ Requisitos para Rodar

- Java 17 ou superior  
- Maven  
- Banco de dados compatível (ex: MySQL, PostgreSQL)

---

## 🧠 Observações

Este projeto é um *checkpoint acadêmico* e pode ser expandido com:

- 🔒 Autenticação com *Spring Security*
- 📥 Validações com @Valid
- 🧪 Testes automatizados com *JUnit*
- 📄 Documentação com *Swagger*
- 📂 Upload de arquivos (ex: exames, documentos médicos)
=======
# Checkpoint3Micro
>>>>>>> 276d9ec13044e820c61998f64356f1b1b545ab34
