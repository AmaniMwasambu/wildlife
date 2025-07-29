package com.wildlife.models;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  Integer id;

    @Column(name = "animal_name")
    private String animalName;

    @Column(name = "animal_location")
    private String animalLocation;

    private String weight;

    private Boolean isHealthy;

    private Boolean isDeleted;

    public Animal(Integer id, String animalName, String animalLocation, String weight, Boolean isHealthy, Boolean isDeleted) {
        this.id = id;
        this.animalName = animalName;
        this.animalLocation = animalLocation;
        this.weight = weight;
        this.isHealthy = isHealthy;
        this.isDeleted = isDeleted;
    }

    public Animal() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalLocation() {
        return animalLocation;
    }

    public void setAnimalLocation(String animalLocation) {
        this.animalLocation = animalLocation;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Boolean getHealthy() {
        return isHealthy;
    }

    public void setHealthy(Boolean healthy) {
        isHealthy = healthy;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
