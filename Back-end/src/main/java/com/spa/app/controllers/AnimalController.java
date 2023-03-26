package com.spa.app.controllers;

/**
@Controller
@RequestMapping("/")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/{id}")
    public String getAnimalById(@PathVariable("id") int id, Model model) {
        Animal animal = animalService.findAnimalById(id);
        model.addAttribute("animal", animal);
        return "animal-details";
    }

    @GetMapping("/list")
    public String getAllAnimals(Model model) {
        List<Animal> animals = animalService.getAllAnimals();
        model.addAttribute("animals", animals);
        return "animal-list";
    }

    @PostMapping("/add")
    public String addAnimal(@ModelAttribute("animal") Animal animal) {
        animalService.addAnimal(animal);
        return "redirect:/animals/list";
    }

    @GetMapping("/add")
    public String showAddAnimalForm(Model model) {
        Animal animal = new Animal();
        model.addAttribute("animal", animal);
        return "add-animal";
    }
}**/
