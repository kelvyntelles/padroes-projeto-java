package com.example.PadroesProjeto.padroesestruturais.mediator;

public interface Setor {
    String receberReclamacao(String mensagem);
    String receberElogio(String mensagem);
    String receberSugestao(String mensagem);
}
