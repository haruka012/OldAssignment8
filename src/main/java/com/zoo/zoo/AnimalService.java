package com.zoo.zoo;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {
  private AnimalMapper animalMapper;

  public AnimalService(AnimalMapper animalMapper) {
    this.animalMapper = animalMapper;
  }

  public List<Animal> findAll(){
    return animalMapper.findAll();
  }
  public List<Animal> startsWith(String prefix){
    return animalMapper.startsWith(prefix);
  }
  public List<Animal> endsWith(String suffix){
    return animalMapper.endsWith(suffix);
  }
  public List<Animal> contains(String name){
    return animalMapper.contains(name);
  }

}
