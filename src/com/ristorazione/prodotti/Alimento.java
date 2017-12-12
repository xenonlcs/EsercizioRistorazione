package com.ristorazione.prodotti;

import com.ristorazione.menu.ElementoMenu;

public abstract class Alimento{
    String nome;

    public Alimento(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public abstract String toString();
}
