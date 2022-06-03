package com.example.PadroesProjeto.padroesestruturais.visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirJogador(Jogador jogador) {
        return "Jogador{" +
                "nome=" + jogador.getNome() +
                ", salario='" + jogador.getSalario() + '\'' +
                ", time=" + jogador.getNomeTime() +
                '}';
    }

    @Override
    public String exibirTecnico(Tecnico tecnico) {
        return "Jogador{" +
                "nome=" + tecnico.getNome() +
                ", salario='" + tecnico.getSalario() + '\'' +
                ", time=" + tecnico.getNomeTime() +
                '}';
    }
}
