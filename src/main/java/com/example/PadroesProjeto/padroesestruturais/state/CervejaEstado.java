package com.example.PadroesProjeto.padroesestruturais.state;

public interface CervejaEstado {

    String getEstado();
    String moagem(Cerveja cerveja);
    String mosturacao(Cerveja cerveja);
    String filtracao(Cerveja cerveja);
    String fervuraMosto(Cerveja cerveja);
    String classificacao(Cerveja cerveja);
    String maturacao(Cerveja cerveja);
    String fermentacao(Cerveja cerveja);
    String resfriamentoMosto(Cerveja cerveja);
    String envase(Cerveja cerveja);

}
