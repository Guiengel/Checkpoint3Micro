package br.com.fiap.checkpoint1.dto.Consulta;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.fiap.checkpoint1.model.Consulta;
import br.com.fiap.checkpoint1.model.ConsultaStatus;


public class ConsultaRequestUpdate {
    private Long pacienteId;
    private Long profissionalId;
    private LocalDateTime data_consulta;
    private String statusConsulta;
    private Integer quantidade_horas;
    private BigDecimal valor_consulta;

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

        public Consulta toModel(Consulta consulta){
        consulta.setData_consulta(this.data_consulta);
        consulta.setStatusConsulta(ConsultaStatus.valueOf(this.statusConsulta));
        consulta.setQuantidade_horas(this.quantidade_horas);
        consulta.setValor_consulta(this.valor_consulta);
        return consulta;
    }
}
