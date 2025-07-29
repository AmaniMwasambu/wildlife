package com.wildlife.services;

import com.wildlife.models.Animal;
import com.wildlife.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AnimalServiceImpl implements AnimalService {
        private final AnimalRepository animalRepository;

        @Autowired
        public AnimalServiceImpl(AnimalRepository animalRepository){
            this.animalRepository = animalRepository;
        }

    @Override
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public Animal getAnimalById(int id) {
        return null;
    }

    @Override
    public Void saveAnimal(Animal animal) {

        return null;
    }

    @Override
    public Void updateAnimal(Animal animal) {

        return null;
    }

    @Override
    public void deleteAnimal(Animal animal, int id) {

    }


}
