package com.example.PadroesProjeto.padroesestruturais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveNotificarUmCliente() {
        Netflix netflix = new Netflix("Top Gun", "ação");
        Cliente cliente = new Cliente("Kelvyn");
        cliente.cadastrar(netflix);
        netflix.notificarFilmeNovo();
        assertEquals(
                "Kelvyn, novo filme na Netflix{filme=Top Gun, gênero=ação}",
                cliente.getUltimaNotificacao()
        );
    }

    @Test
    void deveNotificarTodosClientes() {
        Netflix netflix = new Netflix("Top Gun", "ação");
        Cliente cliente1 = new Cliente("Kelvyn");
        Cliente cliente2 = new Cliente("Telles");
        cliente1.cadastrar(netflix);
        cliente2.cadastrar(netflix);
        netflix.notificarFilmeNovo();
        assertEquals(
                "Kelvyn, novo filme na Netflix{filme=Top Gun, gênero=ação}",
                cliente1.getUltimaNotificacao()
        );
        assertEquals(
                "Telles, novo filme na Netflix{filme=Top Gun, gênero=ação}",
                cliente2.getUltimaNotificacao()
        );
    }

    @Test
    void naoDeveNotificarCliente() {
        Netflix netflix = new Netflix("Top Gun", "ação");
        Cliente cliente = new Cliente("Kelvyn");
        netflix.notificarFilmeNovo();
        assertEquals(
                null,
                cliente.getUltimaNotificacao()
        );
    }
}