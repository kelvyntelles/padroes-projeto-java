package com.example.PadroesProjeto.padroesestruturais.command;

public class AbrirIscricoes implements Tarefa {

    private InscricoesCampeonato inscricoesCampeonato;

    public AbrirIscricoes(InscricoesCampeonato inscricoesCampeonato) {
        this.inscricoesCampeonato = inscricoesCampeonato;
    }

    public void executar() {
        this.inscricoesCampeonato.abrirInscricoes();
    }

    public void cancelar() {
        this.inscricoesCampeonato.fecharInscricoes();
    }

}
