package com.example.PadroesProjeto.padroesestruturais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdmCompeonatoTest {

    AdmCompeonato admCompeonato;
    InscricoesCampeonato inscricoesCampeonato;

    @BeforeEach
    void setUp() {
        admCompeonato = new AdmCompeonato();
        inscricoesCampeonato = new InscricoesCampeonato ("Libertadores", 2022);
    }

    @Test
    void deveAbrirInscricao() {
        Tarefa abrirInscricoes = new AbrirIscricoes(inscricoesCampeonato);
        admCompeonato.executarTarefa(abrirInscricoes);

        assertEquals("Inscrições abertas", inscricoesCampeonato.getSituacao());
    }

    @Test
    void deveFecharInscricao() {
        Tarefa fecharInscricoes = new FecharInscricoes(inscricoesCampeonato);
        admCompeonato.executarTarefa(fecharInscricoes);

        assertEquals("inscrições fechadas", inscricoesCampeonato.getSituacao());
    }

    @Test
    void deveCancelarFechamentoInscricao() {
        Tarefa abrirInscricoes = new AbrirIscricoes(inscricoesCampeonato);
        Tarefa fecharInscricoes = new FecharInscricoes(inscricoesCampeonato);

        admCompeonato.executarTarefa(abrirInscricoes);
        admCompeonato.executarTarefa(fecharInscricoes);

        admCompeonato.cancelarUltimaTarefa();

        assertEquals("Inscrições abertas", inscricoesCampeonato.getSituacao());
    }

}