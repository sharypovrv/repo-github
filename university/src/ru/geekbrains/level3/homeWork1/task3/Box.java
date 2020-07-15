package ru.geekbrains.level3.homeWork1.task3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> arr;
    private float weight;

    public Box() {
        arr = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        arr.add(fruit);
        this.weight += fruit.getWeight();
    }

    public float getWeight() {
        return weight;
    }

    public boolean compare(Box<?> compareBox) {
        return Math.abs(this.getWeight() - compareBox.getWeight()) < 0.0001f;
    }

    public void pourAllToAnotherBox(Box<T> anotherBox) {
        for (T fruit : arr) {
            anotherBox.addFruit(fruit);
        }
        arr.clear();
        weight = 0;
    }

}
