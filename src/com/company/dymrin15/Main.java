package com.company.dymrin15;

public class Main {

    public static void main(String[] args) {
        Box<Fruit> box = new Box<>();
        box.add(new Apple());
        Box<Fruit> boxToMerge = new Box<>();
        boxToMerge.merge(box);
        System.out.println(box);
        System.out.println("Merged box has within " + boxToMerge);
    }
}
