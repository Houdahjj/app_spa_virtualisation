package com.spa.app.services;

import com.spa.app.Animal;
import com.spa.app.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnimalService {


    private AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimalById(int id) {
        return animalRepository.findAnimalById(id);
    }

    public void addAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    public void updateAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    public void deleteAnimal(int id) {
        animalRepository.deleteById((long) id);
    }

    public Animal findAnimalById(int id) {
        return animalRepository.findAnimalById(id);
    }

}
