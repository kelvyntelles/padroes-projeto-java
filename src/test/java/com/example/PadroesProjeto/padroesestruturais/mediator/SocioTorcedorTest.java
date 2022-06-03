package com.example.PadroesProjeto.padroesestruturais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocioTorcedorTest {

    @Test
    void deveElogiarClube() {
        SocioTorcedor socioTorcedor = new SocioTorcedor();
        assertEquals("A Ouvidoria agradece seu contato.\nO Clube respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Clube agradece a mensagem: Ótima reforma no clube",
                socioTorcedor.elogiarClube("Ótima reforma no clube"));
    }

    @Test
    void deveReclamarClube() {
        SocioTorcedor socioTorcedor = new SocioTorcedor();
        assertEquals("A Ouvidoria agradece seu contato.\nO Clube respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Clube vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                socioTorcedor.reclamarClube("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirClube() {
        SocioTorcedor socioTorcedor = new SocioTorcedor();
        assertEquals("A Ouvidoria agradece seu contato.\nO Clube respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Clube vai analisar a sugestão: Deve melhorar a área do estacionamento",
                socioTorcedor.sugerirClube("Deve melhorar a área do estacionamento"));
    }

}