package com.example.PadroesProjeto.padroesestruturais.strategy;

public class OperacaoSomarSalario implements Operacao {

    public float calcular(float valorHora, float horasTrabalhadasSemana) {
        if (horasTrabalhadasSemana == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        }
        else {
            return valorHora * horasTrabalhadasSemana;
        }
    }

}
