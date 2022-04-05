package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        //ctrl+d --> duplicate line
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Carrot");

        ArrayList<String> groceries = new ArrayList<>();
        groceries.addAll(fruits);//to add a complete list
        groceries.addAll(vegetables);
        System.out.println(groceries);

        ArrayList<String> itemsToBoRemoved = new ArrayList<>();
        itemsToBoRemoved.add("Apple");
        itemsToBoRemoved.add("Onion");

        groceries.removeAll(itemsToBoRemoved);//remove a complete list from another list
        System.out.println(groceries);

    }
}
