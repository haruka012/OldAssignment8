package com.zoo.zoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AnimalController {
    private AnimalMapper animalMapper;

    public AnimalController(AnimalMapper animalMapper){
        this.animalMapper = animalMapper;
    }

    //全件取得する
    @GetMapping("/animals")
    public List<Animal> findAll(){
        return animalMapper.findAll();
    }

    //クエリ文字列を指定して、検索する。（検索条件が複数ある場合）
    @GetMapping("/animal/search")
    public List<Animal> findByAnimalNames(AnimalSearchRequest request){

        List<Animal> animals = new ArrayList<>();
        animals.addAll(animalMapper.startsWith(request.getStartsWith()));
        animals.addAll(animalMapper.endsWith(request.getEndsWith()));
        animals.addAll(animalMapper.contains(request.getContains()));

        return  animals;

         }
}
