package com.ristorazione.menu;

import com.ristorazione.prodotti.Alimento;

public class ElementoMenu {
    private Alimento alimento;
    private Double price;

    public ElementoMenu(Alimento alimento, Double price){
        this.alimento=alimento;
        this.price=price;
    }

    public Alimento getAlimento(){
        return alimento;
    }

    public Double getPrice(){
        return price;
    }
}
