package com.example.PadroesProjeto.padroesestruturais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveSomarSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.somarSalario(22.0f, 40.0f);
        assertEquals(880.0f, funcionario.getSalario());
    }

    @Test
    void naoDeveCalcularSalarioHorasMenorZero() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.somarSalario(22.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

}