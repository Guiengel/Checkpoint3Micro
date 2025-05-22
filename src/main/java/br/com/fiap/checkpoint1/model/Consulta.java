package br.com.fiap.checkpoint1.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer quantidade_horas;
    private BigDecimal valor_consulta;
    private LocalDateTime criado_as;
    private LocalDateTime atualizado_as;

    @Enumerated(EnumType.STRING)
    private ConsultaStatus statusConsulta;

    private LocalDateTime data_consulta;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;
    
    @ManyToOne
    @JoinColumn(name = "profissional_id", nullable = false)
    private Profissional profissional;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData_consulta() {
        return data_consulta;
    }
    public void setData_consulta(LocalDateTime data_consulta) {
        this.data_consulta = data_consulta;
    }
    public Integer getQuantidade_horas() {
        return quantidade_horas;
    }
    public void setQuantidade_horas(Integer quantidade_horas) {
        this.quantidade_horas = quantidade_horas;
    }
    public BigDecimal getValor_consulta() {
        return valor_consulta;
    }
    public void setValor_consulta(BigDecimal valor_consulta) {
        this.valor_consulta = valor_consulta;
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

    public Paciente getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Profissional getProfissional() {
        return profissional;
    }
    
    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public ConsultaStatus getStatusConsulta() {
        return statusConsulta;
    }
    public void setStatusConsulta(ConsultaStatus statusConsulta) {
        this.statusConsulta = statusConsulta;
    }



    
}
