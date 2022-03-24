package com.syntax.reviewclass8;

public class StringClass2 {
    public static void main(String[] args) {
        String name = "teyfur";
        System.out.println(name.startsWith("T"));
        System.out.println(name.toLowerCase().startsWith("T"));
        System.out.println(name.endsWith("r"));
        System.out.println(name.contains("y"));

        String s = "habib";
        char output = s.charAt(2);
        System.out.println(output);
    }
}
