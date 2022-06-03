package com.example.PadroesProjeto.padroesestruturais.iterator;

public class Artista {

    private String nome;
    private boolean statusContrato;

    public Artista(String nome, boolean statusContrato) {
        this.nome = nome;
        this.statusContrato = statusContrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return statusContrato;
    }

    public void setAtivo(boolean statusContrato) {
        this.statusContrato = statusContrato;
    }

}
