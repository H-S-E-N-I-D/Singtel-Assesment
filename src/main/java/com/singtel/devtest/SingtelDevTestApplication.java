package com.singtel.devtest;

import com.singtel.devtest.model.Bird;
import com.singtel.devtest.service.AnimalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingtelDevTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingtelDevTestApplication.class, args);

		Bird bird = new Bird();
		bird.walk();
		//bird.fly(); Now every Bird cannot fly
		bird.sing();

		//E) Q1)
		AnimalService animalService = new AnimalService();
		System.out.println("Number of animals can fly = " + animalService.countFlyableAnimals());
		System.out.println("Number of animals can walk = " + animalService.countWalkableAnimals());
		System.out.println("Number of animals can sing = " + animalService.countSingableAnimals());
		System.out.println("Number of animals can swim = " + animalService.countSwimmableAnimals());

	}

}
