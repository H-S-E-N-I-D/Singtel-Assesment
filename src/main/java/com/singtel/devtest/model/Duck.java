package com.singtel.devtest.model;

import com.singtel.devtest.util.Swimmable;

public class Duck extends Bird implements Swimmable {

    public Duck() {
        this.setName("Duck");
    }

    @Override
    public void sing() {
        System.out.println("Quack, quack");

    }

    @Override
    public void swim() {
        System.out.println("I am swimming");

    }
}
