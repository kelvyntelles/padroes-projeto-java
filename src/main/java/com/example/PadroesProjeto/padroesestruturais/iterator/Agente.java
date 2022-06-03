package com.example.PadroesProjeto.padroesestruturais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Agente implements Iterable<Artista> {

    private List<Artista> artistas = new ArrayList<Artista>();

    public Agente(Artista... artistas) {
        this.artistas = Arrays.asList(artistas);
    }

    @Override
    public Iterator<Artista> iterator() {
        return artistas.iterator();
    }

}
