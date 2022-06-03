package com.example.PadroesProjeto.padroesestruturais.state;

public class CervejaEstadoMoagem implements CervejaEstado {

    private CervejaEstadoMoagem() {};
    private static CervejaEstadoMoagem instance = new CervejaEstadoMoagem();
    public static CervejaEstadoMoagem getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Moagem";
    }

    public String moagem(Cerveja cerveja) {
        return "Moagem não realizada";
    }

    public String mosturacao(Cerveja cerveja) {
        return "Mosturação realizada";
    }

    public String filtracao(Cerveja cerveja) {
        return "Filtragem não realizada";
    }

    public String fervuraMosto(Cerveja cerveja) {
        return "Fervura do mosto não realizada";
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
        return "Resfriação do mosto não realizada";
    }

    public String envase(Cerveja cerveja) {
        return "Invasão não realizada";
    }

}
