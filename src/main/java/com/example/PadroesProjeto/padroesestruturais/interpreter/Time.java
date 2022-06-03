package com.example.PadroesProjeto.padroesestruturais.interpreter;

public class Time {

    public static String formula = "totalGols * 500 + salario";

    public static double calcularSalario(double totalGols, double salario) {
        String expressao;
        expressao = formula.replace("totalGols", Double.toString(totalGols));
        expressao = expressao.replace("salario", Double.toString(salario));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }

}
