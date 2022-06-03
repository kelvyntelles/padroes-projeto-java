package com.example.PadroesProjeto.padroesestruturais.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BebidaProxyTest {

    @BeforeEach
    void setUp() {
        DB.addBebida(new Bebida(1, "Heineken", "Cerveja", "Água, malte e lúpulo", "600", 14.0f));
        DB.addBebida(new Bebida(2, "Budweiser", "Cerveja", "Água, malte, arroz e lúpulo", "600", 12.0f));
    }

    @Test
    void deveRetornarInformacoesBebida() {
        BebidaProxy bebida = new BebidaProxy(1);

        assertEquals(Arrays.asList("Heineken", "Cerveja"), bebida.obterInformacoes());
    }

    @Test
    void deveRetonarFormulaBebida() {
        Funcionario funcionario = new Funcionario("Kelvyn", true);
        BebidaProxy bebida = new BebidaProxy(2);

        assertEquals(Arrays.asList("Água, malte, arroz e lúpulo"), bebida.obterFormula(funcionario));
    }

    @Test
    void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarPrecoBebida() {
        try {
            Funcionario funcionario = new Funcionario("Telles", false);
            BebidaProxy bebida = new BebidaProxy(2);

            bebida.obterFormula(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Funcionário não autorizado", e.getMessage());
        }
    }
}