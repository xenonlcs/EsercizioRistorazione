package com.ristorazione.prodotti;

import java.awt.*;

public class VinoBio extends Vino implements Biologico {

    private String codice;

    public VinoBio(String nome, Double gradazione, String tipoVino, String colore, String codice) {
        super(nome, gradazione, tipoVino, colore);
        this.codice=codice;
    }

    @Override
    public String getCodice() {
        return codice;
    }
}
