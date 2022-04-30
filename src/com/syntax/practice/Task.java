package com.syntax.practice;

class Main {
    public static void main(String[] args) {
        /**
         interview question
         Create a String and print it in reverse order (Sunday yadnuS).
         */
        String day="Sunday";
        for(int i=day.length()-1; i>=0; i--){
            System.out.print(day.charAt(i));
        }

    }
}