package br.com.fiap.checkpoint1.dto.Consulta;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.fiap.checkpoint1.model.Consulta;

public class ConsultaResponse {
    private Long id;
    private Long pacienteId;
    private Long profissionalId;
    private LocalDateTime data_consulta;
    private String statusConsulta;

    private Integer quantidade_horas;
    private BigDecimal valor_consulta;
    private LocalDateTime criado_as;
    private LocalDateTime atualizado_as;

        public ConsultaResponse toDto(Consulta consulta) {
        this.setId(consulta.getId());
        this.setPacienteId(consulta.getPaciente().getId());
        this.setProfissionalId(consulta.getProfissional().getId());
        this.setData_consulta(consulta.getData_consulta());
        this.setStatusConsulta(consulta.getStatusConsulta().getMensagem());
        this.setQuantidade_horas(consulta.getQuantidade_horas());
        this.setValor_consulta(consulta.getValor_consulta());
        this.setCriado_as(consulta.getCriado_as());
        this.setAtualizado_as(consulta.getAtualizado_as());
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Long getProfissionalId() {
        return profissionalId;
    }

    public void setProfissionalId(Long profissionalId) {
        this.profissionalId = profissionalId;
    }

    public LocalDateTime getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(LocalDateTime data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(String statusConsulta) {
        this.statusConsulta = statusConsulta;
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

}
