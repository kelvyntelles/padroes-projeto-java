package com.example.PadroesProjeto.padroesestruturais.memento;

public class FuncionarioEstadoAfastado implements FuncionarioEstado {

    private FuncionarioEstadoAfastado() {};
    private static FuncionarioEstadoAfastado instance = new FuncionarioEstadoAfastado();
    public static FuncionarioEstadoAfastado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Afastado";
    }

}
