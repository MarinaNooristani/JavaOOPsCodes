package com.syntax.class16;

public class StringReplaceAll {
    public static void main(String[] args) {
        String str = "123456%&#=@^_$hjsfjfbhADNDC";
        System.out.println(str.replaceAll("[0-9]", "Julia"));
        System.out.println(str.replaceAll("[0-9]", ""));
        System.out.println(str.replaceAll("[a-z]", ""));
        System.out.println(str.replaceAll("[A-Z]", ""));
        System.out.println(str.replaceAll("[a-z]", ""));
        System.out.println(str.replaceAll("[!-/]", ""));
        System.out.println(str.replaceAll("[A-Za-z]", ""));
        System.out.println(str.replaceAll("[A-Za-z0-9]", ""));
        System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
        System.out.println(str.replaceAll("[A-z]", ""));

    }


}
