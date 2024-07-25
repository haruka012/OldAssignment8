package com.zoo.zoo;

public class AnimalNotFoundException extends RuntimeException {

  public AnimalNotFoundException(String message) {

    super(message);
  }

}