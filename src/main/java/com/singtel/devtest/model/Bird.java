package com.singtel.devtest.model;

import com.singtel.devtest.util.Flyable;
import com.singtel.devtest.util.Singable;

public class Bird extends Animal implements Flyable, Singable {


    @Override
    public void fly() {
        System.out.println("I am flying");

    }

    @Override
    public void sing() {
        System.out.println("I am singing");

    }

}
