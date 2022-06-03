package com.example.PadroesProjeto.padroesestruturais.iterator;

import java.util.Iterator;

public class Censo {

    public static Integer contarArtistasAtivosContrato(Agente agente) {
        int quantidade = 0;
        for (Artista artista : agente) {
            if (artista.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalArtistas(Agente agente) {
        int quantidade = 0;
        for (Iterator a = agente.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
