package com.singtel.devtest.model;

import com.singtel.devtest.util.Flyable;

public class Butterfly extends Animal implements Flyable {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
