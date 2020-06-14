package com.singtel.devtest.model;

import com.singtel.devtest.util.Flyable;

public class Caterpillar extends WalkableAnimal implements Flyable {

    private Caterpillar caterpillar;
    private Butterfly butterfly;

    public Caterpillar() {
        caterpillar = this;

    }

    @Override
    public void fly() {
        if (this.butterfly == null) {
            throw new IllegalStateException();
        } else {
            this.butterfly.fly();
        }
    }

    @Override
    public void walk() {
        if (this.caterpillar == null) {
            throw new IllegalStateException();
        } else {
            this.caterpillar.walk();
        }
    }

    public void transform() {
        if (this.caterpillar == null)
            throw new IllegalStateException();

        this.caterpillar = null;
        this.butterfly = new Butterfly();
    }

    public boolean isCaterpillar() {
        return this.butterfly == null && this.caterpillar != null;
    }

    public boolean isButterfly() {
        return this.caterpillar == null && this.butterfly != null;
    }

}
