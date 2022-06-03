package com.example.PadroesProjeto.padroesestruturais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirJogador() {
        Jogador jogador = new Jogador("Gabriel Barbosa", "1.200.000.00", new Time("Flamengo"));
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Jogador{nome=Gabriel Barbosa, salario='1.200.000.00', time=Flamengo}", visitor.exibir(jogador));
    }

    @Test
    void deveExibirTecnico() {
        Tecnico tecnico = new Tecnico("Paulo Souza", "500.000.00", new Time("Flamengo"));
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Jogador{nome=Paulo Souza, salario='500.000.00', time=Flamengo}", visitor.exibir(tecnico));
    }

}