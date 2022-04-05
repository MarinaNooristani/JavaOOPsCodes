package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //non wrapper-->primitive
        ArrayList<Double> numberList = new ArrayList<>();
        Double double1 = new Double(10.5);

        double number = double1.doubleValue();//unboxing -->interview question
        //double1-->wrapper class
        //doubleValue()--> method to convert it to primitive

        Double number2 = new Double(number);//boxing

        double number3 = 10.5;

        Double number4 = number3;//we can assign the primitive directly to wrapper class-->auto boxing

        number3 = number4;//autoUnBoxing

        String name = new String("John");// 'new String' is redundant
        String name1 = "Marina";//so the same thing with wrapper

    }
}
