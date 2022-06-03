package com.example.PadroesProjeto.padroesestruturais.mediator;

public class Clube implements Setor {

    private static Clube instancia = new Clube();

    private Clube() {}

    public static Clube getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Clube vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Clube agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Clube vai analisar a sugestão: " + mensagem;
    }

}
