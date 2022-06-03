package com.example.PadroesProjeto.padroesestruturais.proxy;

import java.util.Arrays;
import java.util.List;

public class Bebida implements IBebida {

    private Integer codigo;
    private String nome;
    private String tipo;
    private String formula;
    private String QtdML;
    private Float preco;

    public Bebida(int codigo) {
        this.codigo = codigo;
        Bebida objeto = DB.getBebida(codigo);
        this.nome = objeto.nome;
        this.tipo = objeto.tipo;
        this.formula = objeto.formula;
        this.QtdML = objeto.QtdML;
        this.preco = objeto.preco;
    }

    public Bebida(Integer codigo, String nome, String tipo, String formula, String QtdML, Float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.formula = formula;
        this.QtdML = QtdML;
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public List<String> obterInformacoes() {
        return Arrays.asList(this.nome, this.tipo);
    }

    @Override
    public List<String> obterFormula(Funcionario funcionario) {
        return Arrays.asList(this.formula);
    }
}
