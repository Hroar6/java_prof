package com.company;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public float getWeight() {
        float weight = 0;
        for (T t : fruits) {
            weight += t.getWeight();
        }
        return weight;
    }

    public void addFruit(T fruit, int fruitNum) {
        for (int i = 0; i < fruitNum; i++) {
            fruits.add(fruit);
        }
    }

    public void addFromBox(Box<T> box){
        box.fruits.addAll(this.fruits);
        fruits.clear();
    }
}
