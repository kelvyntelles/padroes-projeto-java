package com.example.PadroesProjeto.padroesestruturais.visitor;

public class Tecnico implements Pessoa {

    private String nome;
    private String salario;
    private Time time;

    public Tecnico(String nome, String salario, Time time) {
        this.nome = nome;
        this.salario = salario;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public String getSalario() {
        return salario;
    }

    public String getNomeTime() {
        return this.time.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirTecnico(this);
    }

}
