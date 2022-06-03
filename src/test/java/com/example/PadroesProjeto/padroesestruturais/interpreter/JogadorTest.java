package com.example.PadroesProjeto.padroesestruturais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Jogador jogador = new Jogador();
        jogador.setTotalGols(5.0);
        jogador.setSalario(1000.0);

        assertEquals(3500.0, jogador.calcularSalario());
    }

}