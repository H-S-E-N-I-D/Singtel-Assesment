package com.singtel.devtest.model;

import com.singtel.devtest.util.FishEater;

public class Shark extends Fish implements FishEater {

    public Shark() {
        super(Size.LARGE, Color.GREY);
        this.setName("Shark");
    }

    @Override
    public void eat(Fish fish) {
        System.out.println("I eat Fish");
    }
}
