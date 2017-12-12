package com.ristorazione.prodotti;

public class Carne extends Alimento{
    private String animale;
    private String pezzoAnimale;

    public Carne(String nome, String animale, String pezzoAnimale) {
        super(nome);
        this.animale=animale;
        this.pezzoAnimale=pezzoAnimale;
    }

    public String getAnimale() {
        return animale;
    }

    public String getPezzoAnimale() {
        return pezzoAnimale;
    }

    @Override
    public String toString() {
        return "Carne " + nome + "\n\tAnimale: " + animale + "\n\tPezzo: " + pezzoAnimale;
    }
}
