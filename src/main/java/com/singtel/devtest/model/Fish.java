package com.singtel.devtest.model;

public class Fish extends SwimmableAnimal {

    public enum Size {SMALL, MEDIUM, LARGE}
    ;

    public enum Color {GREY, ORANGE}

    protected Size size;
    protected Color color;


    public Fish(Size size, Color color) {
        this.size = size;
        this.color = color;
        this.setName("Fish");

    }

    public Fish() {
        this.setName("Fish");
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

}
