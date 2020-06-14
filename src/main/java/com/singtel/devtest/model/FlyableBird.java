package com.singtel.devtest.model;

import com.singtel.devtest.util.Flyable;

public class FlyableBird extends Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
