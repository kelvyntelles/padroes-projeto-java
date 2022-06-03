package com.example.PadroesProjeto.padroesestruturais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteTimeGrandeTest {

    @Test
    void deveRetonarAprovado() {
        TesteTimeGrande jogador = new TesteTimeGrande();
        jogador.setNota1(7.5f);
        jogador.setNota2(7.5f);
        jogador.setNota3(7.5f);
        assertEquals("Aprovado", jogador.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        TesteTimeGrande jogador = new TesteTimeGrande();
        jogador.setNota1(7.5f);
        jogador.setNota2(7.5f);
        jogador.setNota3(7.4f);
        assertEquals("Reprovado", jogador.verificarAprovacao());
    }

}