package com.example.materialtest;

/**
 * Created by slow_time on 2017/9/14.
 */

public class Fruit {

    private String name;

    private int fruitId;

    public Fruit(String name, int fruitId) {
        this.name = name;
        this.fruitId = fruitId;
    }

    public String getName() {
        return name;
    }

    public int getFruitId() {
        return fruitId;
    }
}
