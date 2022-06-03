package com.example.PadroesProjeto.padroesestruturais.observer;

import java.util.Observable;

public class Netflix extends Observable {

    private String nomeFilme;
    private String genero;

    public Netflix(String nomeFilme, String genero) {
        this.nomeFilme = nomeFilme;
        this.genero = genero;
    }

    public void notificarFilmeNovo() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Netflix{" +
                "filme=" + nomeFilme +
                ", gênero=" + genero +
                '}';
    }

}
