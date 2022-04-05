package com.syntax.class28;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo2 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");
        //iterator is an interface that has 3 methods hasNext(), next() and remove()
        Iterator<String> iterator = courses.iterator();
        System.out.println(iterator.hasNext());//true or false
        System.out.println(iterator.next());//print the element
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());//if false then we should not call the next method
        //System.out.println(iterator.next());  runtime error

    }
}
