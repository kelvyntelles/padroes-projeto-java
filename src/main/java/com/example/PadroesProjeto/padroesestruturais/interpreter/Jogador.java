package com.example.PadroesProjeto.padroesestruturais.interpreter;

public class Jogador {

    private double totalGols;
    private double salario;

    public double getTotalGols() {
        return totalGols;
    }

    public void setTotalGols(double totalGols) {
        this.totalGols = totalGols;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario() {
        return Time.calcularSalario(this.totalGols, this.salario);
    }

}
