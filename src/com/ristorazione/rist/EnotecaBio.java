package com.ristorazione.rist;

import com.ristorazione.exceptions.NotItemInRist;
import com.ristorazione.exceptions.NotVinoBioinEnoBio;
import com.ristorazione.menu.ElementoMenu;
import com.ristorazione.menu.Menu;
import com.ristorazione.prodotti.VinoBio;

public class EnotecaBio extends Enoteca {

    public EnotecaBio(String nome, Menu menu) {
        super(nome, menu);
    }

    @Override
    public void addMenuItem(ElementoMenu em) throws NotItemInRist {
        if(em.getAlimento() instanceof VinoBio){
            menu.getElementiMenu().add(em);
        }else{
            throw new NotVinoBioinEnoBio("Un'enoteca bio puo' servire solo vino bio");
        }
    }


}
