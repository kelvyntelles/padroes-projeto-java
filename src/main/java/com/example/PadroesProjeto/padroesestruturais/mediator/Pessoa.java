package com.example.PadroesProjeto.padroesestruturais.mediator;

public class Pessoa {

    public String elogiarClube(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioClube(mensagem);
    }

    public String reclamarClube(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoClube(mensagem);
    }

    public String sugerirClube(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoClube(mensagem);
    }

}

