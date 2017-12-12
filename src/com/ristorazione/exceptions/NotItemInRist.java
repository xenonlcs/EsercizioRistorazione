package com.ristorazione.exceptions;

public class NotItemInRist extends Throwable{
    private String s;

    public NotItemInRist(String s){
        this.s=s;
    }

    @Override
    public String toString() {
        return s;
    }
}
