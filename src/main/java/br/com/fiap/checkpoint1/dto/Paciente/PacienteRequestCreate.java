package br.com.fiap.checkpoint1.dto.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.fiap.checkpoint1.model.Paciente;

public class PacienteRequestCreate {
    private String nome;
    private String endereco;
    private String bairro;
    private String email;
    private String telefone_completo;
    private LocalDate data_nascimento;


    public Paciente toModel(){
    
        Paciente paciente = new Paciente();
        paciente.setNome(this.nome);
        paciente.setEndereco(this.endereco);
        paciente.setBairro(this.bairro);
        paciente.setEmail(this.email);
        paciente.setTelefone_Completo(this.telefone_completo);
        paciente.setData_nascimento(this.data_nascimento);
        paciente.setCriado_as(LocalDateTime.now());
        paciente.setAtualizado_as(LocalDateTime.now());
        return paciente;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone_completo() {
        return telefone_completo;
    }
    public void setTelefone_completo(String telefone_completo) {
        this.telefone_completo = telefone_completo;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
