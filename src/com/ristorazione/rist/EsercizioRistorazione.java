package com.ristorazione.rist;

import com.ristorazione.exceptions.NotItemInRist;
import com.ristorazione.menu.ElementoMenu;
import com.ristorazione.menu.Menu;

public abstract class EsercizioRistorazione {
    String nome;
    Menu menu;

    public EsercizioRistorazione(String nome, Menu menu){
        this.nome=nome;
        this.menu=menu;
    }

    public abstract void addMenuItem(ElementoMenu em) throws NotItemInRist;
    public abstract void removeMenuItem(ElementoMenu em);

    @Override
    public String toString() {
        return nome;
    }

    public String printMenu(){
        return menu.toString();
    }
}
