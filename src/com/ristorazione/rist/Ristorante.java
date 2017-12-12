package com.ristorazione.rist;

import com.ristorazione.exceptions.NotItemInRist;
import com.ristorazione.menu.ElementoMenu;
import com.ristorazione.menu.Menu;

public class Ristorante extends EsercizioRistorazione {

    public Ristorante(String nome, Menu menu) {
        super(nome, menu);
    }

    @Override
    public void addMenuItem(ElementoMenu em) throws NotItemInRist {
        menu.getElementiMenu().add(em);
    }

    @Override
    public void removeMenuItem(ElementoMenu em) {
        menu.getElementiMenu().remove(em);
    }
}
