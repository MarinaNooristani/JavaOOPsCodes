package com.syntax.class31;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo1 {
    public static void main(String[] args) {
        Hashtable<String, String> students = new Hashtable<>();//Hashtable is thread safe and HashMap is not
        students.put("1", "Moreed");
        students.put("2", "Emilia");
        students.put("3", "Medine");
        students.put("4", "Yazgul");
        students.put("5", "Gulden");

        Set<Map.Entry<String, String>> entrySet = students.entrySet();
        //storing one data structure inside another type of data structure is known us nesting of data structures
        //like having one container inside another container
        for (Map.Entry<String, String> entry : entrySet
        ) {
            System.out.println(entry);
        }

    }
}