package com.example.PadroesProjeto.padroesestruturais.chainofresponsability;

public class FuncionarioDiretor extends Funcionario {

    public FuncionarioDiretor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoContrato.getTipoDocumentoContrato());
        listaDocumentos.add(TipoDocumentoRescisaoContrato.getTipoDocumentoRescisaoContrato());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }

}
