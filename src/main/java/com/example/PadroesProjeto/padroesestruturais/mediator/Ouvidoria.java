package com.example.PadroesProjeto.padroesestruturais.mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioClube(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Clube respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Clube.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoClube(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Clube respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Clube.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoClube(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Clube respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Clube.getInstancia().receberSugestao(mensagem);
    }

}
