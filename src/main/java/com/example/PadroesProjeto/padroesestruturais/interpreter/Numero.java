package com.example.PadroesProjeto.padroesestruturais.interpreter;

public class Numero implements InterpretadorExpressao {

    private double numero;

    public Numero(double numero) {
        this.numero = numero;
    }

    public double interpretar() {
        return numero;
    }

    public double getNumero() {
        return this.numero;
    }

}