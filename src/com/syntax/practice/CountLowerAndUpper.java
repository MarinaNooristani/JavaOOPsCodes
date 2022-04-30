package com.syntax.practice;

public class CountLowerAndUpper {
    public static void main(String[] args) {
        //find how many lowercase and how many uppercase characters are there in the string name
        String name = "MArina NoOrIstAni";
        int countLower = 0;
        int countUpper = 0;
        //in ASCII table each character has a decimal value
        //uppercase 65-90 and lowercase 97-122

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 65 && name.charAt(i) <= 90) {
                countUpper++;
            } else if (name.charAt(i) >= 97 && name.charAt(i) <= 122) {
                countLower++;
            }
        }
        System.out.println(countLower);
        System.out.println(countUpper);

    }
}

