package com.example.PadroesProjeto.padroesestruturais.templatemethod;

public class TesteTimePequeno extends  Jogador {

    public String verificarAprovacao() {
        if (this.calcularMediaTreino() >= 6.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

}
