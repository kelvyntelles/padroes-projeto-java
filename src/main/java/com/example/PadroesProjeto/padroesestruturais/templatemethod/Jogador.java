package com.example.PadroesProjeto.padroesestruturais.templatemethod;

public abstract class Jogador {

    private int numero;
    protected String nome;
    private float nota1;
    private float nota2;
    private float nota3;

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float calcularMediaTreino() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public abstract String verificarAprovacao();

    public String getTipo() {
        return "Jogador";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "matricula=" + this.numero +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarAprovacao() +
                '}';
    }
}
