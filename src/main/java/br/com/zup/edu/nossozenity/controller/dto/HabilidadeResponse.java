package br.com.zup.edu.nossozenity.controller.dto;

import br.com.zup.edu.nossozenity.zupper.Habilidade;

public class HabilidadeResponse {

    private String nome;

    private String nivel;

    public HabilidadeResponse(Habilidade habilidade) {
        this.nome = habilidade.getNome();
        this.nivel = habilidade.getNivel().name();
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }
}
