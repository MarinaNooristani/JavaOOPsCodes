package com.syntax.class16;

public class Task5 {
    /*How would you check if String is palindrome or not?
      aba=> true   aba aba
      Abbc =>false  Abbc  cbbA
     */
    //1)create a method to reverse the string
    String reverseString(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    //2)create a method to check string is palindrome or not
    boolean isPalindrome(String inputStr) {
        String reverseStr = reverseString(inputStr);//calling the reverseString method inside this method without creating an object
        return reverseStr.equals(inputStr);//return either true or false
    }

    public static void main(String[] args) {
        //create object
        Task5 object = new Task5();
        //call the method
        System.out.println(object.isPalindrome("aba"));
        System.out.println(object.isPalindrome("Abbc"));
    }
}

