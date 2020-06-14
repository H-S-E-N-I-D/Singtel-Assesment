package com.singtel.devtest.model;

import com.singtel.devtest.util.Walkable;

public class WalkableAnimal extends Animal implements Walkable {

    @Override
    public void walk() {
        System.out.println("I am walking");

    }
}
