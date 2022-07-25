package br.com.zup.edu.nossozenity.controller;

import br.com.zup.edu.nossozenity.controller.dto.CertificadoResponse;
import br.com.zup.edu.nossozenity.controller.dto.HabilidadeResponse;
import br.com.zup.edu.nossozenity.controller.dto.KudoResponse;
import br.com.zup.edu.nossozenity.zupper.Zupper;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class ZupperResponse {

    private String nome;

    private String cargo;

    private String tempoDeCasa;

    private List<KudoResponse> kudos;

    private List<HabilidadeResponse> habilidadeResponses;

    private List<CertificadoResponse> certificados;

    public ZupperResponse(Zupper zupper) {

        this.nome = zupper.getNome();
        this.cargo = zupper.getCargo();
        this.tempoDeCasa = calculaTempoDeCasa(zupper);
        this.kudos = zupper.getKudosRecebidos().stream().map(KudoResponse::new).collect(Collectors.toList());
        this.habilidadeResponses = zupper.getHabilidades().stream().map(HabilidadeResponse::new).collect(Collectors.toList());
        this.certificados = zupper.getCertificados().stream().map(CertificadoResponse::new).collect(Collectors.toList());

    }


    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getTempoDeCasa() {
        return tempoDeCasa;
    }

    public List<KudoResponse> getKudos() {
        return kudos;
    }

    public List<HabilidadeResponse> getHabilidadeResponses() {
        return habilidadeResponses;
    }

    public List<CertificadoResponse> getCertificados() {
        return certificados;
    }


    private String calculaTempoDeCasa(Zupper zupper) {

        return Period.between(zupper.getDataAdmissao(), LocalDate.now()).toString();


    }
}
