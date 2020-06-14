package com.singtel.devtest.model;

import com.singtel.devtest.util.Singable;

public class Bird extends WalkableAnimal implements Singable {

    public Bird() {
        this.setName("Bird");
    }

    @Override
    public void sing() {
        System.out.println("I am singing");
    }

}
