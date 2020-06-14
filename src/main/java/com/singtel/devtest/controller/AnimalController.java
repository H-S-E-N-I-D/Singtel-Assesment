package com.singtel.devtest.controller;

import com.singtel.devtest.response.AnimalResponse;
import com.singtel.devtest.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/api")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping("/animals/list")
    public AnimalResponse getAllEmployees() {
        AnimalResponse response = new AnimalResponse();
        response.setAnimals(Arrays.asList(animalService.getAnimals()));
        response.setStatus("Success");
        return response;
    }
}
