package com.example.PadroesProjeto.padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Pendencia {

    private List<Jogador> jogadoresComPendencia = new ArrayList<Jogador>();

    public void addJogadorPendente(Jogador jogador) {
        this.jogadoresComPendencia.add(jogador);
    }

    public boolean verificarAlunoComPendencia(Jogador jogador) {
        return this.jogadoresComPendencia.contains(jogador);
    }

}
