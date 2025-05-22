package br.com.fiap.checkpoint1.dto.Profissional;

import java.math.BigDecimal;
import br.com.fiap.checkpoint1.model.Profissional;

public class ProfissionalRequestUpdate {
    private String nome;
    private BigDecimal valor_hora;
    private String especialidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getValor_hora() {
        return valor_hora;
    }
    public void setValor_hora(BigDecimal valor_hora) {
        this.valor_hora = valor_hora;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Profissional toModel(Profissional profissional){
    profissional.setNome(this.nome);
    profissional.setValor_hora(this.valor_hora);
    profissional.setEspecialidade(this.especialidade);
    return profissional;
    }

}
