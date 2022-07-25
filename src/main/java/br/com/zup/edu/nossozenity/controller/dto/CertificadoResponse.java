package br.com.zup.edu.nossozenity.controller.dto;

import br.com.zup.edu.nossozenity.zupper.Certificado;

public class CertificadoResponse {

    private String nome;

    private String instituicaoEmissora;

    private String link;

    private String tipo;

    public CertificadoResponse(Certificado certificado) {
        this.nome = certificado.getNome();
        this.instituicaoEmissora= certificado.getInstituicaoEmissora();
        this.link= certificado.getLink();
        this.tipo=certificado.getTipo().name();
    }

    public String getNome() {
        return nome;
    }
}
