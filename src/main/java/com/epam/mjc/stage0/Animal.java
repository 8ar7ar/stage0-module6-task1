package com.epam.mjc.stage0;

public class Animal {
    private String color;

    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFour) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFour;
    }

    public String getDescription() {
        String four = this.hasFur ? "a" : "no";
        String pawS = this.numberOfPaws == 1 ? "paw" : "paws";
        String description = "This animal is mostly " + color +
                             ". It has " + numberOfPaws + " " + pawS +
                             " and " + four + " fur.";
        return description;
    }

}
