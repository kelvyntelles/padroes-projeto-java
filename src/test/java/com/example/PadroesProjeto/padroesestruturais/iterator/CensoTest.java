package com.example.PadroesProjeto.padroesestruturais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarArtistasAtivosContrato() {
        Agente agente = new Agente(
                new Artista("Kelvyn", true),
                new Artista("Lopes", true),
                new Artista("Telles", false),
                new Artista("Maria", true)
        );
        assertEquals(3, Censo.contarArtistasAtivosContrato(agente));
    }

    @Test
    void deveContarTotalArtistas() {
        Agente agente = new Agente(
                new Artista("Kelvyn", true),
                new Artista("Lopes", true),
                new Artista("Telles", false),
                new Artista("Maria", true)
        );
        assertEquals(4, Censo.contarTotalArtistas(agente));
    }

}