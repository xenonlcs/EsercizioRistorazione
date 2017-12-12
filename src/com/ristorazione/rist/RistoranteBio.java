package com.ristorazione.rist;

import com.ristorazione.exceptions.NotBioinRistoranteBio;
import com.ristorazione.exceptions.NotItemInRist;
import com.ristorazione.menu.ElementoMenu;
import com.ristorazione.menu.Menu;
import com.ristorazione.prodotti.Biologico;
import com.ristorazione.prodotti.Vino;

public class RistoranteBio extends Ristorante {

    public RistoranteBio(String nome, Menu menu) {
        super(nome, menu);
    }

    @Override
    public void addMenuItem(ElementoMenu em) throws NotItemInRist {
        if(em.getAlimento() instanceof Biologico){
            menu.getElementiMenu().add(em);
        }else{
            throw new NotBioinRistoranteBio("Un ristorane bio puo' servire solo alimenti bio");
        }
    }
}
