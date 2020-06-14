package com.singtel.devtest.model;

import com.singtel.devtest.util.Flyable;
import com.singtel.devtest.util.Singable;

public class Bird extends WalkableAnimal implements Singable {


    @Override
    public void sing() {
        System.out.println("I am singing");
    }

}
