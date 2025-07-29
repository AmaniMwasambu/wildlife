package com.wildlife.services;

import com.wildlife.models.Animal;

import java.util.List;

public interface AnimalService {
        List<Animal> getAllAnimals();

        Animal getAnimalById(int id);

        public Void saveAnimal(Animal animal);

        public Void updateAnimal(Animal animal);

        public void deleteAnimal(Animal animal, int id);
}
