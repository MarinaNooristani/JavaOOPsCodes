package com.syntax.class16;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s = "This is a sentence";
        //array
        String[] strArr = s.split(" ");//splitting based on spaces
        //if you see any spaces split the string
        System.out.println(Arrays.toString(strArr));//to retrieve all elements from array without using loop
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[3]);
        String s2 = "This is a sentence. Batch 12 is great." +
                " Edward is not great. He is super great";
        String[] strArr2 = s2.split("[.]");//splitting based on full stops
        // and based on which character you split you can't see it as output
        System.out.println(strArr2.length);
        System.out.println(strArr2[3].trim());

    }
}
