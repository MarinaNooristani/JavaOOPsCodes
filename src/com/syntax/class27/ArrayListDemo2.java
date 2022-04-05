package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(5.6);
        numbers.add(1.7);
        numbers.add(2.9);
        numbers.add(6.1);
        System.out.println(numbers.get(3));
        numbers.remove(2);
        System.out.println(numbers);
        System.out.println(numbers.size());

        for (Double number : numbers) {
            System.out.println(number);
        }
    }
}
