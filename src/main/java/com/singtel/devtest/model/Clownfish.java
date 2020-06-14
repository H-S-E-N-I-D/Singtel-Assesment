package com.singtel.devtest.model;

import com.singtel.devtest.util.JokeMaker;

public class Clownfish extends Fish implements JokeMaker {

    public Clownfish() {
        super(Size.SMALL, Color.ORANGE);
        this.setName("Clownfish");
    }

    @Override
    public void makeJokes() {
        System.out.println("I am joking");
    }
}
