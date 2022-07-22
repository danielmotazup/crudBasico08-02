package br.com.zup.edu.nossozenity.controller;

import br.com.zup.edu.nossozenity.zupper.Zupper;

public class ZupperRequest {

    private String nome;

    private String cargo;

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public ZupperRequest(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
}
