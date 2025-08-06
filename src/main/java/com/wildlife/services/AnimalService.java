package com.wildlife.services;

import com.wildlife.models.Animal;

import java.util.List;

public interface AnimalService {
        List<Animal> getAllAnimals();

        Animal getAnimalById(int id);

        Animal getAnimalByAnimalCode(String animalCode);

        public Void saveAnimal(Animal animal);

        public Void updateAnimal(Animal animal, int id);

        public Void deleteAnimal(Animal animal, int id);
}
