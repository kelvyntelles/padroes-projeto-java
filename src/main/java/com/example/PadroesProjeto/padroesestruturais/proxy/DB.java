package com.example.PadroesProjeto.padroesestruturais.proxy;

import java.util.HashMap;
import java.util.Map;

public class DB {

    private static Map<Integer, Bebida> bebidas = new HashMap<>();

    public static Bebida getBebida(Integer codigo) {
        return bebidas.get(codigo);
    }

    public static void addBebida(Bebida bebida) {
        bebidas.put(bebida.getCodigo(), bebida);
    }

}
