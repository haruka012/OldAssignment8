package com.zoo.zoo;

public class Animal {
    private int id;
    private String name;

    private String type;

    private  String classification;

    private String sex;

    public Animal(int id, String name, String type, String classification, String sex) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.classification = classification;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getClassification() {
        return classification;
    }
    public String getSex() {
        return sex;
    }
}
