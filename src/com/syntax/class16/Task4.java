package com.syntax.class16;

public class Task4 {
    public static void main(String[] args) {
        /*How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
        */

        String string = "This is sentence i want to reverse";
        StringBuilder str = new StringBuilder(string);
        str.reverse();
        string = str.toString();
        System.out.println(str);//esrever ot tnaw i ecnetnes si sihT
        System.out.println("___________________________________________");
        //using string
        String s = "Sunday";
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        //to convert back to string
        s = s1.toString();
        System.out.println(s);//yadnuS


    }
}
