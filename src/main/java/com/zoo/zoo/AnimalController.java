package com.zoo.zoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AnimalController {
    private AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    //全件取得する
    @GetMapping("/animals")
    public List<Animal> getAnimals(){
        return animalService.findAll();
    }

    //クエリ文字列を指定して、検索する。（検索条件が複数ある場合）
    @GetMapping("/animal/search")
    public List<Animal> findByAnimalNames(AnimalSearchRequest request){

        List<Animal> animals = new ArrayList<>();
        animals.addAll(animalService.startsWith(request.getStartsWith()));
        animals.addAll(animalService.endsWith(request.getEndsWith()));
        animals.addAll(animalService.contains(request.getContains()));

        return  animals;
    }
}
