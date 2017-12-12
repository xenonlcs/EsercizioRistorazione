package com.ristorazione.menu;


import java.util.LinkedList;


public class Menu {

    private LinkedList<ElementoMenu> elementiMenu;

    public Menu(){
        elementiMenu = new LinkedList<>();
    }

    @Override
    public String toString() {
        String s="";
        for (ElementoMenu em : elementiMenu) {
            s+=em.getAlimento().getNome()+" "+em.getPrice()+"\n";
        }
        return s;
    }

    public LinkedList<ElementoMenu> getElementiMenu() {
        return elementiMenu;
    }
}
