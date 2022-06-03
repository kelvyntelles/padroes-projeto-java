package com.example.PadroesProjeto.padroesestruturais.chainofresponsability;

public class FuncionarioSupervisor extends Funcionario {

    public FuncionarioSupervisor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoAssinaturaPonto.getTipoDocumentoAssinaturaPonto());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }

}
