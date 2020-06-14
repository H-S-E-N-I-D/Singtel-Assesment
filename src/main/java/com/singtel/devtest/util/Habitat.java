package com.singtel.devtest.util;

public enum Habitat {
    WITH_DOGS("Woof, woof"),
    WITH_CATS("Meow"),
    NEAR_ROOSTERS("Cock-a-doodle-doo"),
    DEFAULT("Parrot Singing");

    private String sound;

    public String getSound() {
        return this.sound;
    }

    Habitat(String sound) {
        this.sound = sound;
    }
}
