package br.com.zup.edu.nossozenity.controller.dto;

import br.com.zup.edu.nossozenity.zupper.Kudo;

public class KudoResponse {

    private String nome;

    private String recebido;

    private String enviado;

    public KudoResponse(Kudo kudo) {
        this.nome = kudo.getNome().name();
        this.recebido = kudo.getRecebido().getNome();
        this.enviado = kudo.getEnviado().getNome();
    }


    public String getNome() {
        return nome;
    }

    public String getRecebido() {
        return recebido;
    }

    public String getEnviado() {
        return enviado;
    }
}
