package com.syntax.class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s = new String("Asghar is great");
        // System.out.println(s.concat("haha"));
        s.concat("haha");
        System.out.println(s);

        StringBuilder s1 = new StringBuilder("Asghar is great");
        /*
         System.out.println(s1.append(" Haha"));
         s1.reverse();
        */
        s1.append(" Haha");
        System.out.println(s1);
        //ctrl + alt + l format

        StringBuilder str = new StringBuilder("");

        for (int i = 0; i < 100; i++) {
            str.append(i);

        }

    }
}
