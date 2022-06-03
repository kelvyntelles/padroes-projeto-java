package com.example.PadroesProjeto.padroesestruturais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteTimePequenoTest {

    @Test
    void deveRetonarAprovado() {
        TesteTimePequeno jogador = new TesteTimePequeno();
        jogador.setNota1(6.0f);
        jogador.setNota2(6.0f);
        jogador.setNota3(6.0f);
        assertEquals("Aprovado", jogador.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        TesteTimePequeno jogador = new TesteTimePequeno();
        jogador.setNota1(6.0f);
        jogador.setNota2(6.0f);
        jogador.setNota3(5.9f);
        assertEquals("Reprovado", jogador.verificarAprovacao());
    }

}