package br.com.fiap.checkpoint1.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String endereco;
    private String bairro;
    private String email;
    private String telefone_completo;
    private LocalDate data_nascimento;
    private LocalDateTime criado_as;
    private LocalDateTime atualizado_as;

    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getBairro(){
        return bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone_Completo(){
        return telefone_completo;
    }
    
    public void setTelefone_Completo(String telefone_completo){
        this.telefone_completo = telefone_completo;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
    }

    public LocalDateTime getCriado_as() {
        return criado_as;
    }

    public void setCriado_as(LocalDateTime criado_as) {
        this.criado_as = criado_as;
    }

    public LocalDateTime getAtualizado_as() {
        return atualizado_as;
    }

    public void setAtualizado_as(LocalDateTime atualizado_as) {
        this.atualizado_as = atualizado_as;
    }

}
