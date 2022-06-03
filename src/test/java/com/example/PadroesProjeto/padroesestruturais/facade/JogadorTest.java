package com.example.PadroesProjeto.padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveRetornarPendenciaContratoAposentadoria() {
        Jogador jogador = new Jogador();
        Contrato.getInstancia().addJogadorPendente(jogador);

        assertEquals(false, jogador.aposentar());
    }

    @Test
    void deveRetornarJogadorSemPendenciaAposentadoria() {
        Jogador jogador = new Jogador();

        assertEquals(true, jogador.aposentar());
    }

}