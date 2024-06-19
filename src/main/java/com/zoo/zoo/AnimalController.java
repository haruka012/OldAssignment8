package com.zoo.zoo;

import jakarta.servlet.http.HttpServletRequest;
import java.time.ZonedDateTime;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
  public List<Animal> getAnimals() {

    return animalService.findAll();
  }

  //クエリ文字列を指定して、検索する。（検索条件が複数ある場合）
  @GetMapping("/animal/search")
  public List<Animal> findByAnimalNames(AnimalSearchRequest request) {

    List<Animal> animals = new ArrayList<>();
    animals.addAll(animalService.startsWith(request.getStartsWith()));
    animals.addAll(animalService.endsWith(request.getEndsWith()));
    animals.addAll(animalService.contains(request.getContains()));

    return animals;
  }

  @GetMapping("/animals/{id}")
  public Animal getAnimal(@PathVariable("id") int id) {

    return animalService.findAnimal(id);
  }

  @ExceptionHandler(value = AnimalNotFoundException.class)
  public ResponseEntity<Map<String, String>> handleAnimalNotFoundException(
      AnimalNotFoundException e, HttpServletRequest request) {

    Map<String, String> body = Map.of(
        "timestamp", ZonedDateTime.now().toString(),
        "status", String.valueOf(HttpStatus.NOT_FOUND.value()),
        "error", HttpStatus.NOT_FOUND.getReasonPhrase(),
        "message", e.getMessage(),
        "path", request.getRequestURI()
    );
    return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
  }
}
