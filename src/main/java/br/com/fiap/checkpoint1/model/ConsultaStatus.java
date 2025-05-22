package br.com.fiap.checkpoint1.model;

public enum ConsultaStatus {
    AGENDADA("Consulta agendada"),
    REALIZADA ("Consulta realizada"),
    CANCELADA ("Consulta cancelada");

    ConsultaStatus(String mensagem){
        this.mensagem = mensagem;
    }

    private String mensagem;

    public String getMensagem(){
        return mensagem;
    }
}
