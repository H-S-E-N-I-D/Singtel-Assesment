package com.singtel.devtest.model;

import java.util.HashMap;

public class Rooster extends Chicken {

    private static HashMap<String, String> roosterSounds;

    static {
        roosterSounds = new HashMap<>();
        roosterSounds.put("Danish", "kykyliky");
        roosterSounds.put("Dutch", "kukeleku");
        roosterSounds.put("Finnish", "kukko kiekuu");
        roosterSounds.put("French", "cocorico");
        roosterSounds.put("German", "kikeriki");
        roosterSounds.put("Greek", "kikiriki");
        roosterSounds.put("Hebrew", "coo-koo-ri-koo");
        roosterSounds.put("Hungarian", "kukuriku");
        roosterSounds.put("Italian", "chicchirichi");
        roosterSounds.put("Japanese", "ko-ke-kok-ko-o");
        roosterSounds.put("Portuguese", "cucurucu");
        roosterSounds.put("Russian", "kukareku");
        roosterSounds.put("Swedish", "kuckeliku");
        roosterSounds.put("Turkish", "kuk-kurri-kuuu");
        roosterSounds.put("Urdu", "kuklooku");
        roosterSounds.put("English", "Cock-a-doodle-doo");

    }

    private String language;

    public Rooster(String language) {
        this.language = language;
    }

    public Rooster() {
        this.language = "English";
    }

    @Override
    public void sing() {
        System.out.println(roosterSounds.get(this.language));
    }

}
