package com.example.PadroesProjeto.padroesestruturais.chainofresponsability;

public class TipoDocumentoAssinaturaPonto implements TipoDocumento {

    private static TipoDocumentoAssinaturaPonto tipoDocumentoAssinaturaPonto = new TipoDocumentoAssinaturaPonto();

    private TipoDocumentoAssinaturaPonto() {};

    public static TipoDocumentoAssinaturaPonto getTipoDocumentoAssinaturaPonto() {
        return tipoDocumentoAssinaturaPonto;
    }

}
