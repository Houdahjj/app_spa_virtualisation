package com.spa.app.controllers;
import com.spa.app.Animal;
import com.spa.app.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WebappController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/")
    public String webapp(){
        return "webapp";
    }

    @GetMapping("/ajout")
    public String ajout(){
        return "ajout";
    }

    @GetMapping("/suppression")
    public String suppression(){
        return "suppression";
    }

    @GetMapping("/inventaire")
    public ModelAndView inventaire() {
        List<Animal> animaux = animalRepository.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("animaux", animaux);
        modelAndView.setViewName("inventaire");
        return modelAndView;
    }

    @PostMapping("/supprimer")
    public String supprimerAnimal(@RequestParam("animalId") int animalId) {
        animalRepository.deleteById((long) animalId);
        return "redirect:/inventaire";
    }

    @PostMapping("/ajouterAnimal")
    public String ajouterAnimal(@RequestParam String nom, @RequestParam String type, @RequestParam int age,
                                @RequestParam String race, @RequestParam double poids) {

        Animal animal = new Animal(0, nom, type, age, race, (float) poids, null);
        animalRepository.save(animal);
        return "redirect:/inventaire";
    }



    @PostMapping("/ajouter")
    public String ajouter(@ModelAttribute Animal animal) {
        animalRepository.save(animal);
        return "redirect:/inventaire";
    }



}
