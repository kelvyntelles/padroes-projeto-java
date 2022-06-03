package com.example.PadroesProjeto.padroesestruturais.state;

public class Cerveja {

    private String nome;
    private CervejaEstado estado;

    public Cerveja() {
        this.estado = CervejaEstadoMoagem.getInstance();
    }

    public void setEstado(CervejaEstado estado) {
        this.estado = estado;
    }

    public String moagem() {
        return estado.moagem(this);
    }

    public String mosturacao() {
        return estado.mosturacao(this);
    }

    public String filtracao() {
        return estado.filtracao(this);
    }

    public String fervuraMosto() {
        return estado.fervuraMosto(this);
    }

    public String classificacao() {
        return estado.classificacao(this);
    }

    public String maturacao() {
        return estado.maturacao(this);
    }

    public String fermentacao() {
        return estado.fermentacao(this);
    }

    public String resfriamentoMosto() {
        return estado.resfriamentoMosto(this);
    }

    public String envase() {
        return estado.envase(this);
    }

}
