package com.company.dymrin15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private static final float EMPTY_SIZE = 0.0F;
    private List<T> fruits = new ArrayList<>();

    public List<T> getFruits() {
        return fruits;
    }

    public List<T> toList(T[] values) {
        return Arrays.asList(values);
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void addAll(List<T> otherFruits) {
        fruits.addAll(otherFruits);
    }

    public void addAllToList(T... otherFruits) {
        fruits.addAll(Arrays.asList(otherFruits));
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return EMPTY_SIZE;
        }

        for (T next : fruits) {
            if (next != null) {
                return next.getWeight() * fruits.size();
            }
        }

        return EMPTY_SIZE;
    }


    public boolean compare(Box<? extends Fruit> other) {
        return getWeight() == other.getWeight();
    }

    public void merge(Box<T> other) {
        fruits.addAll(other.getFruits());
        other.getFruits().clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}