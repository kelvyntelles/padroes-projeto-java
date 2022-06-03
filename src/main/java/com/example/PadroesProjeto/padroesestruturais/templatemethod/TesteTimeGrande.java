package com.example.PadroesProjeto.padroesestruturais.templatemethod;

public class TesteTimeGrande extends Jogador {

    public String verificarAprovacao() {
        if (this.calcularMediaTreino() >= 7.5f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

}
