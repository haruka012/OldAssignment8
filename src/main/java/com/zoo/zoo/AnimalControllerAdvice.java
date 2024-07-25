package com.zoo.zoo;

import jakarta.servlet.http.HttpServletRequest;
import java.time.ZonedDateTime;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AnimalControllerAdvice {

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
