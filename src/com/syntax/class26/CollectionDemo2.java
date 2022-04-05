package com.syntax.class26;

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("India");
        countries.add("Iraq");
        countries.add("Afghanistan");
        countries.add("Morocco");
        System.out.println(countries.get(3));
        //System.out.println(countries.get(-1));
        //System.out.println(countries.get(6));out of bound
        System.out.println(countries);
        countries.add(3,"Pakistan");
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove("Pakistan");
        System.out.println(countries);
        countries.clear();
        System.out.println(countries);
        System.out.println(countries.size());
    }
}
