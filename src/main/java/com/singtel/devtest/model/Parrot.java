package com.singtel.devtest.model;

import com.singtel.devtest.util.Habitat;

public class Parrot extends FlyableBird {
    private Habitat habitat;

    public Parrot() {
        habitat = Habitat.DEFAULT;
    }

    public Parrot(Habitat habitat) {
        this.habitat = habitat;
    }

    @Override
    public void sing() {
        System.out.println(this.habitat.getSound());
    }
}
