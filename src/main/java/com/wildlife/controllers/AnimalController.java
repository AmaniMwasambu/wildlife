package com.wildlife.controllers;

import com.wildlife.models.Animal;
import com.wildlife.services.AnimalService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")

public class AnimalController {
    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

@GetMapping
public List<Animal> getAllAnimals(){
        return animalService.getAllAnimals();
}

@GetMapping("/{id}")
public Animal getAnimalById(@PathVariable int id){
    return animalService.getAnimalById(id);
}

@PostMapping
public Void saveAnimal(@RequestBody Animal animal){
        return animalService.saveAnimal(animal);
}

//@PatchMapping("/{id}")
//public Void updateAnimal(@RequestBody Animal animal, @PathVariable int id){
//        return animalService.updateAnimal(animal, id);
//}
//
//@DeleteMapping("/{id}")
//public Void deleteAnima(@PathVariable int id){
//        return animalService.deleteAnimal(id);
//}
}
