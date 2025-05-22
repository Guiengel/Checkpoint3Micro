package br.com.fiap.checkpoint1.dto.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.fiap.checkpoint1.model.Paciente;

public class PacienteResponse {
    private Long id;
    private String nome;
    private String endereco;
    private String bairro;
    private String email;
    private String telefone_completo;
    private LocalDate data_nascimento;
    private LocalDateTime criado_as;
    private LocalDateTime atualizado_as;

    public PacienteResponse toDto(Paciente paciente){
        this.setId(paciente.getId());
        this.setNome(paciente.getNome());
        this.setEndereco(paciente.getEndereco());
        this.setBairro(paciente.getBairro());
        this.setEmail(paciente.getEmail());
        this.setTelefone_completo(paciente.getTelefone_Completo());
        this.setData_nascimento(paciente.getData_nascimento());
        this.setCriado_as(paciente.getCriado_as());
        this.setAtualizado_as(paciente.getAtualizado_as());
        return this;

    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
