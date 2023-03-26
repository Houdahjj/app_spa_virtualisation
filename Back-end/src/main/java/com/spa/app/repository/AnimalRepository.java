package com.spa.app.repository;

import com.spa.app.Animal;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    Animal findAnimalById(int id);
}
