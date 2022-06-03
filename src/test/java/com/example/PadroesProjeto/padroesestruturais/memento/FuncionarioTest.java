package com.example.PadroesProjeto.padroesestruturais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveArmazenarEstados() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertEquals(2, funcionario.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        funcionario.restauraEstado(0);
        assertEquals(FuncionarioEstadoTrabalhando.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        funcionario.restauraEstado(1);
        assertEquals(FuncionarioEstadoFerias.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}