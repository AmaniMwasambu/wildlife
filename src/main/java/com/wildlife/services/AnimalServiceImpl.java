package com.wildlife.services;

import com.wildlife.models.Animal;
import com.wildlife.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class AnimalServiceImpl implements AnimalService {
        private final AnimalRepository animalRepository;

        @Autowired
        public AnimalServiceImpl(AnimalRepository animalRepository){
            this.animalRepository = animalRepository;
        }
    // GET REQUEST FOR ALL ANIMALS
    @Override
    public List<Animal> getAllAnimals(){
            List<Animal> allAnimals = animalRepository.findAll();
            return allAnimals;
        }


    //GET REQUEST FOR ONE ANIMAL BY ID
    @Override
    public Animal getAnimalById(int id) {
       Optional<Animal> existingAnimal = animalRepository.findById(id);
       if (existingAnimal.isEmpty()){
           return null;
       }
       else {
           return existingAnimal.get();
       }
    }

    @Override
    public Animal getAnimalByAnimalCode(String animalCode) {
        return null;
    }

    //POST REQUEST: SAVE ANIMAL
    @Override
    public Void saveAnimal(Animal animal) {
         Optional<Animal> existingAnimal = animalRepository.findByAnimalCode(animal.getAnimalCode());
         if (existingAnimal.isPresent()){
             return null;
         }

         else {
             animalRepository.save(animal);
             return this.saveAnimal(animal);
         }
    }
    // PATCH REQUEST FOR UPDATING AN ANIMAL
    @Override
    public Void updateAnimal(Animal animal, int id) {
         Optional<Animal> existingAnimal = animalRepository.findById(id);
         if (existingAnimal.isEmpty()){
             return null;
         }else {
             existingAnimal.get().setAnimalName(animal.getAnimalName());
             existingAnimal.get().setAnimalCode(animal.getAnimalCode());
             existingAnimal.get().setAnimalLocation(animal.getAnimalLocation());
             animalRepository.save(existingAnimal.get());
             return this.saveAnimal(animal);
         }
    }

    @Override
    public Void deleteAnimal(Animal animal, int id) {
        Optional<Animal> existingAnimal = animalRepository.findById(id);
        if (existingAnimal.isEmpty()){
            return null;
        }else {
            existingAnimal.get().setDeleted(true);
            animalRepository.save(existingAnimal.get());
            return null;
        }

    }


}
