package com.example.PadroesProjeto.padroesestruturais.proxy;

import java.util.List;

public class BebidaProxy implements IBebida {

    private Bebida bebida;

    private Integer codigo;

    public BebidaProxy(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public List<String> obterInformacoes() {
        if (this.bebida == null) {
            this.bebida = new Bebida(this.codigo);
        }
        return this.bebida.obterInformacoes();
    }

    @Override
    public List<String> obterFormula(Funcionario funcionario) {
        if (!funcionario.isAdministrador()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if (this.bebida == null) {
            this.bebida = new Bebida(this.codigo);
        }
        return this.bebida.obterFormula(funcionario);
    }

}
