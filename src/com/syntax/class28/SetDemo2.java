package com.syntax.class28;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        //no duplicates
        //but it maintains the insertion order
        LinkedHashSet<String> fruit = new LinkedHashSet<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
