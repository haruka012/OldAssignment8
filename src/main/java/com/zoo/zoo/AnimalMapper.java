package com.zoo.zoo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnimalMapper {
    @Select("SELECT * FROM animals")
    List<Animal> findAll();

}
