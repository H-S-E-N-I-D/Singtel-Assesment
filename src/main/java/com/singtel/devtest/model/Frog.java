package com.singtel.devtest.model;

import com.singtel.devtest.util.Swimmable;

public class Frog extends WalkableAnimal implements Swimmable {

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
