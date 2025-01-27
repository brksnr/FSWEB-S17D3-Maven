package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Koala {
    private int id;
    private String name;
    private double weight;
    private double sleepHour;
    private String gender;

    public Koala(int id, String name, double weight, double sleepHour, String gender) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.sleepHour = sleepHour;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getSleepHour() {
        return sleepHour;
    }

    public String getGender() {
        return gender;
    }
}
