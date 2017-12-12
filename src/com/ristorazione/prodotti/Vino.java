package com.ristorazione.prodotti;

import java.awt.*;

public class Vino extends Alimento {
    private Double gradazione;
    private String tipoVino;
    private String colore;

    public Vino(String nome, Double gradazione, String tipoVino, String colore) {
        super(nome);
        this.gradazione=gradazione;
        this.tipoVino = tipoVino;
        this.colore = colore;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public String getColore() {
        return colore;
    }

    @Override
    public String toString() {
        return "Vino " + nome + "\n\tTipo: " + tipoVino + "\n\tColore: " + colore;
    }
}
