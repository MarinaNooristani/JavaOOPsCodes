package com.syntax.class31;

import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {
        /**
         * Create the collection that will store single unique Objects of a String type
         *  in which order is preserved.
         *  Write a logic to concatenate all string from the collection.
         */

        LinkedHashSet<String> drinks = new LinkedHashSet<>();
        drinks.add("Coke");
        drinks.add("Vodka");
        drinks.add("tequila");
        drinks.add("margarita");
        drinks.add("Fanta");
        StringBuilder allDrinks = new StringBuilder();//String Buffer is old data structure it has thread safety property
        //it's slower than stringBuilder because we're not writing thread safe code, so we're not using it
        for (String drink : drinks
        ) {
            allDrinks.append(drink).append(" ");
        }
        System.out.println(allDrinks);

    }
}
