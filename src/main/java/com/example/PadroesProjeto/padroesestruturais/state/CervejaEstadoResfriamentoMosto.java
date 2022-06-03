package com.example.PadroesProjeto.padroesestruturais.state;

public class CervejaEstadoResfriamentoMosto implements CervejaEstado {

    private CervejaEstadoResfriamentoMosto() {};
    private static CervejaEstadoResfriamentoMosto instance = new CervejaEstadoResfriamentoMosto();
    public static CervejaEstadoResfriamentoMosto getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Resfriamento do mosto";
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
        return "Maturação não realizada";
    }

    public String fermentacao(Cerveja cerveja) {
        return "Fermentacao não realizada";
    }

    public String resfriamentoMosto(Cerveja cerveja) {
        return "resfriação do mosto não realizada";
    }

    public String envase(Cerveja cerveja) {
        return "Invasão realizada";
    }

}
