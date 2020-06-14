package com.singtel.devtest.model;

import com.singtel.devtest.util.Flyable;

public class Butterfly extends Animal implements Flyable {

    public Butterfly() {
        this.setName("Butterfly");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
