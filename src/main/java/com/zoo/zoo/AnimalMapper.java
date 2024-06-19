package com.zoo.zoo;

import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnimalMapper {
    @Select("SELECT * FROM animals")
    List<Animal> findAll();

    @Select("SELECT * FROM animals WHERE name LIKE CONCAT(#{prefix},'%')")
    List<Animal> startsWith(@Param("prefix")String prefix);

    @Select("SELECT * FROM animals WHERE name LIKE CONCAT('%',#{suffix})")
    List<Animal> endsWith(@Param("suffix") String suffix);

    @Select("SELECT * FROM animals WHERE name LIKE CONCAT('%',#{name},'%')")
    List<Animal> contains(@Param("name")String name);

    @Select("SELECT * FROM animals WHERE id = #{id}")
    Optional<Animal> findByID(int id);

}
