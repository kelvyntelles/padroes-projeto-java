package com.example.PadroesProjeto.padroesestruturais.facade;

public class JogadorFacade {

    public static boolean verificarPendenciasAposentadoria(Jogador jogador) {
        if (Contrato.getInstancia().verificarAlunoComPendencia(jogador)) {
            return false;
        }
        return true;
    }

}
