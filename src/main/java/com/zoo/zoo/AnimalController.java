package com.zoo.zoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {
    private AnimalMapper animalMapper;
    public AnimalController(AnimalMapper animalMapper){
        this.animalMapper = animalMapper;
    }
    @GetMapping("/animals")
    public List<Animal> findAll(){
        return animalMapper.findAll();
    }
}
