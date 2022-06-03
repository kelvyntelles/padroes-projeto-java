package com.example.PadroesProjeto.padroesestruturais.command;

public class FecharInscricoes implements Tarefa {

    private InscricoesCampeonato inscricoesCampeonato;

    public FecharInscricoes(InscricoesCampeonato inscricoesCampeonato) {
        this.inscricoesCampeonato = inscricoesCampeonato;
    }

    public void executar() {
        this.inscricoesCampeonato.fecharInscricoes();
    }

    public void cancelar() {
        this.inscricoesCampeonato.abrirInscricoes();
    }

}
