package com.spa.app;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Animal {
    @Id
    private int id;
    private String nom;
    private String type;
    private int age;
    private String race;
    private float poids;
    private byte[] image;

    public Animal(int id, String nom, String type, int age, String race, float poids, byte[] image) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.age = age;
        this.race = race;
        this.poids = poids;
        this.image = image;
    }

    public Animal() {}

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public float getPoids() {
        return poids;
    }

    public byte[] getImage() {
        return image;
    }
}
