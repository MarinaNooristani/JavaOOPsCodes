package com.syntax.reviewclass13;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add("ahdfbhjadfbjadfbjadbfjhabf");//we can use addFirst method to add this in the first position index
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);


        ArrayList<String> arrayList = new ArrayList<>();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("ahdfbhjadfbjadfbjadbfjhabf");//in here we can pass two parameters to method add(index,element) to add this in the first position index
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);
    }
}
