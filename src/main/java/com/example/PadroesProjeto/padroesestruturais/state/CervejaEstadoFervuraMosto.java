package com.example.PadroesProjeto.padroesestruturais.state;

public class CervejaEstadoFervuraMosto implements CervejaEstado {

    private CervejaEstadoFervuraMosto() {};
    private static CervejaEstadoFervuraMosto instance = new CervejaEstadoFervuraMosto();
    public static CervejaEstadoFervuraMosto getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Fervura do mosto";
    }

    public String moagem(Cerveja cerveja) {
        return "Moagem não realizada";
    }

    public String mosturacao(Cerveja cerveja) {
        return "Mosturação não realizada";
    }

    public String filtracao(Cerveja cerveja) {
        return "Filtragem não realizada";
    }

    public String fervuraMosto(Cerveja cerveja) {
        return "Fervura do mosto não realizada";
    }

    public String classificacao(Cerveja cerveja) {
        return "Classificação realizada";
    }

    public String maturacao(Cerveja cerveja) {
        return "Maturaçõ não realizada";
    }

    public String fermentacao(Cerveja cerveja) {
        return "Fermentacao não realizada";
    }

    public String resfriamentoMosto(Cerveja cerveja) {
        return "resfriação do mosto não realizada";
    }

    public String envase(Cerveja cerveja) {
        return "Invasão não realizada";
    }

}
