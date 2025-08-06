package com.wildlife.repositories;

import com.wildlife.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    Optional<Animal>findByAnimalCode(String animalCode);
}
