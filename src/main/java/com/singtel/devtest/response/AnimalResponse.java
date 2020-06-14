package com.singtel.devtest.response;

import com.singtel.devtest.model.Animal;

import java.util.List;

public class AnimalResponse {
    private List<Animal> animals;
    private String status;
    private List<String> errors;

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
