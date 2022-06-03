package com.example.PadroesProjeto.padroesestruturais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    FuncionarioSupervisor supervisor;
    FuncionarioDiretor diretor;

    @BeforeEach
    void setUp() {
        diretor = new FuncionarioDiretor(null);
        supervisor = new FuncionarioSupervisor(diretor);
    }

    @Test
    void deveRetornarSupervisorParaAssinaturaPonto() {
        assertEquals("Supervisor", supervisor.assinarDocumento(new Documento(TipoDocumentoAssinaturaPonto.getTipoDocumentoAssinaturaPonto())));
    }

    @Test
    void deveRetornarDiretorParaContratarFuncionario() {
        assertEquals("Diretor", diretor.assinarDocumento(new Documento(TipoDocumentoContrato.getTipoDocumentoContrato())));
    }

    @Test
    void deveRetornarDiretorParaRescindirContratoFuncionario() {
        assertEquals("Diretor", diretor.assinarDocumento(new Documento(TipoDocumentoRescisaoContrato.getTipoDocumentoRescisaoContrato())));
    }

}