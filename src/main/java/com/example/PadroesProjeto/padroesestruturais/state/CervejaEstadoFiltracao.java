package com.example.PadroesProjeto.padroesestruturais.state;

public class CervejaEstadoFiltracao implements CervejaEstado {

    private CervejaEstadoFiltracao() {};
    private static CervejaEstadoFiltracao instance = new CervejaEstadoFiltracao();
    public static CervejaEstadoFiltracao getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Filtração";
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
        return "Fervura do mosto realizada";
    }

    public String classificacao(Cerveja cerveja) {
        return "Classificação não realizada";
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
