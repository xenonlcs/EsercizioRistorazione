package com.ristorazione.rist;

import com.ristorazione.exceptions.NotItemInRist;
import com.ristorazione.exceptions.NotVinoInEnoteca;
import com.ristorazione.menu.ElementoMenu;
import com.ristorazione.menu.Menu;
import com.ristorazione.prodotti.Vino;


public class Enoteca extends EsercizioRistorazione{

    public Enoteca(String nome, Menu menu) {
        super(nome, menu);
    }

    @Override
    public void addMenuItem(ElementoMenu em) throws NotItemInRist{

        if(em.getAlimento() instanceof Vino){
            menu.getElementiMenu().add(em);
        }else{
            throw new NotVinoInEnoteca("Un'enoteca puo' servire solo vino");
        }
    }

    @Override
    public void removeMenuItem(ElementoMenu em) {
        menu.getElementiMenu().remove(em);
    }
}
