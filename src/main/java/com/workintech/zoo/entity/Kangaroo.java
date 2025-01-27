package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Kangaroo {
    private int id;
    private String name;
    private double height;
    private double weight;
    private String gender;
    private boolean isAggressive;

    public Kangaroo(int id, String name, double height, double weight, String gender, boolean isAggressive) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.isAggressive = isAggressive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean getIsAggressive() {
        return isAggressive;
    }

    public void setIsAggressive(boolean aggressive) {
        isAggressive = aggressive;
    }
}
