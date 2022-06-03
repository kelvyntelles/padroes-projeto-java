package com.example.PadroesProjeto.padroesestruturais.strategy;

public class Funcionario {

    private float salario;

    public float getSalario() {
        return  salario;
    }

    public void somarSalario(float valorHora, float horasTrabalhadasSemana) {
        Calculadora calculadora = new Calculadora(valorHora, horasTrabalhadasSemana);
        this.salario = calculadora.calcular(new OperacaoSomarSalario());
    }

}
