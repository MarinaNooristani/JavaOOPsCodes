package com.syntax.class16;

public class Taskk4 {
    public static void main(String[] args) {
       /*How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
        */

        String s = "Sunday is great";
        String[] strArray = s.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("____________________________________________________________");

        String s1 = "SUnday";
        Taskk4 obj = new Taskk4();//create an object
        System.out.println(obj.reverseString(s1));//call the method
        System.out.println("_____________________________________________________________");

        String s2 = "This is sentence i want to reverse";
        System.out.println(obj.reverseString(s2));//call the method
        System.out.println("_____________________________________________________________");

        String[] strArr = s2.split(" ");
        // System.out.println(strArr.length);
        // System.out.println(strArr[0]);
        for (int i = 0; i < strArr.length; i++) {
            // System.out.println(strArr[i]);
            System.out.print(obj.reverseString(strArr[i]) + " ");//call the method inside loop
        }

    }

    //1)create a method to reverse the string
    String reverseString(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
