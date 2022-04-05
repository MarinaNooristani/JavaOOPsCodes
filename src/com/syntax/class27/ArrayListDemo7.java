package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListDemo7 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();//BTS it uses array to store data
        //to access the data use arraylist its faster than linklist
        //accessing fast manipulating slow
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);

        arrayList.add(1, 100);//how much work this arraylist has to do to insert this element at index 1
        //we have to move 4 elements
        //if there are 1M elements, and you insert element at index 1

        LinkedList<Integer> numbers = new LinkedList<>();//it does not use any array to store data
        //0-->1-->2-->3    -->pointer     0 node
        //to add or remove element from the list it's faster it doesn't need to do a lot of work
        //accessing slow manipulating fast
        numbers.add(10);
        numbers.add(12);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(1, 100);
    }
}
