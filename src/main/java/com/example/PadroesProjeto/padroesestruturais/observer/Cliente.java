package com.example.PadroesProjeto.padroesestruturais.observer;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void cadastrar(Netflix netflix) {
        netflix.addObserver(this);
    }

    public void update(Observable netflix, Object arg1) {
        this.ultimaNotificacao = this.nome + ", novo filme na " + netflix.toString();
    }

}
