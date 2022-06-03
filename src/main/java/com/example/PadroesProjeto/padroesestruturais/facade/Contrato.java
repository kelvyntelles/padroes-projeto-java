package com.example.PadroesProjeto.padroesestruturais.facade;

import java.util.ArrayList;
public class Contrato extends Pendencia {

    private static Contrato contrato = new Contrato();

    private Contrato() {};

    public static Contrato getInstancia() {
        return contrato;
    }

}
