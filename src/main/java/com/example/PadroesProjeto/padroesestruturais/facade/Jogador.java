package com.example.PadroesProjeto.padroesestruturais.facade;

import java.text.Normalizer;

public class Jogador {

    public boolean aposentar() {
        return JogadorFacade.verificarPendenciasAposentadoria(this);
    }

}
