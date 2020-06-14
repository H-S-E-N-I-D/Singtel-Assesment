package com.singtel.devtest.service;

import com.singtel.devtest.model.*;
import com.singtel.devtest.util.Flyable;
import com.singtel.devtest.util.Singable;
import com.singtel.devtest.util.Swimmable;
import com.singtel.devtest.util.Walkable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AnimalService {

    private Animal[] animals = new Animal[]{
            new Bird(),
            new Duck(),
            new Chicken(),
            new Rooster(),
            new Parrot(),
            new Fish(),
            new Shark(),
            new Clownfish(),
            new Dolphin(),
            new Frog(),
            new Dog(),
            new Butterfly(),
            new Cat()
    };

    public int countFlyableAnimals() {
        long count = Arrays.stream(animals).filter(animal -> animal instanceof Flyable).count();
        return (int) count;
    }

    public int countWalkableAnimals() {
        long count = Arrays.stream(animals).filter(animal -> animal instanceof Walkable).count();
        return (int) count;
    }

    public int countSingableAnimals() {
        long count = Arrays.stream(animals).filter(animal -> animal instanceof Singable).count();
        return (int) count;
    }

    public int countSwimmableAnimals() {
        long count = Arrays.stream(animals).filter(animal -> animal instanceof Swimmable).count();
        return (int) count;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
}
