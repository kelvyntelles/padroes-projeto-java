package com.example.PadroesProjeto.padroesestruturais.memento;

public class FuncionarioEstadoTrabalhando implements FuncionarioEstado {

    private FuncionarioEstadoTrabalhando() {};
    private static FuncionarioEstadoTrabalhando instance = new FuncionarioEstadoTrabalhando();
    public static FuncionarioEstadoTrabalhando getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Trabalhando";
    }

}
