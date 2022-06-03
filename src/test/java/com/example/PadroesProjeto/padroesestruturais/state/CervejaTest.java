package com.example.PadroesProjeto.padroesestruturais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CervejaTest {

    Cerveja cerveja;

    @BeforeEach
    public void setUp() {
        cerveja = new Cerveja();
    }

    // Estado de Moagem

    @Test
    public void deveMosturarCerveja() {
        cerveja.setEstado(CervejaEstadoMoagem.getInstance());
        assertEquals("Mosturação realizada", cerveja.mosturacao());
    }

    @Test
    public void naoDeveFiltrarCerveja() {
        cerveja.setEstado(CervejaEstadoMoagem.getInstance());
        assertEquals("Filtragem não realizada", cerveja.filtracao());
    }

    @Test
    public void naoDeveFervurarMostoCerveja() {
        cerveja.setEstado(CervejaEstadoMoagem.getInstance());
        assertEquals("Fervura do mosto não realizada", cerveja.fervuraMosto());
    }

    @Test
    public void naoDeveMaturarCerveja() {
        cerveja.setEstado(CervejaEstadoMoagem.getInstance());
        assertEquals("Maturaçõ não realizada", cerveja.maturacao());
    }

    @Test
    public void naoDeveFermentarCerveja() {
        cerveja.setEstado(CervejaEstadoMoagem.getInstance());
        assertEquals("Fermentacao não realizada", cerveja.fermentacao());
    }

    @Test
    public void naoDeveResfriarMostoCerveja() {
        cerveja.setEstado(CervejaEstadoMoagem.getInstance());
        assertEquals("Resfriação do mosto não realizada", cerveja.resfriamentoMosto());
    }

    @Test
    public void naoDeveEnvasarCerveja() {
        cerveja.setEstado(CervejaEstadoMoagem.getInstance());
        assertEquals("Invasão não realizada", cerveja.envase());
    }

    @Test
    public void naoDeveClassificarCerveja() {
        cerveja.setEstado(CervejaEstadoMoagem.getInstance());
        assertEquals("Classificação não realizada", cerveja.classificacao());
    }

}