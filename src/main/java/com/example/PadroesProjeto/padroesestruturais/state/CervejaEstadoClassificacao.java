package com.example.PadroesProjeto.padroesestruturais.state;

public class CervejaEstadoClassificacao implements CervejaEstado {

    private CervejaEstadoClassificacao() {};
    private static CervejaEstadoClassificacao instance = new CervejaEstadoClassificacao();
    public static CervejaEstadoClassificacao getInstance() {
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
        return "Fervura do mosto não realizada";
    }

    public String classificacao(Cerveja cerveja) {
        return "Classificação não realizada";
    }

    public String maturacao(Cerveja cerveja) {
        return "Maturação realizada";
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
