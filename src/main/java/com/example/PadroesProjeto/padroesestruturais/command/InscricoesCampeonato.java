package com.example.PadroesProjeto.padroesestruturais.command;

public class InscricoesCampeonato {

    private String nome;
    private int ano;
    private String situacao;

    public InscricoesCampeonato(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirInscricoes() {
        this.situacao = "Inscrições abertas";
    }

    public void fecharInscricoes() {
        this.situacao = "inscrições fechadas";
    }

}
