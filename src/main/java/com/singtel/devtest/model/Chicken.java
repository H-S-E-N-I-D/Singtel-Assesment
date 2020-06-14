package com.singtel.devtest.model;

public class Chicken extends Bird {

    public Chicken() {
        this.setName("Chicken");
    }

    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }
}
