package com.syntax.class22;

public class MethodOverLoading {
    public static void main(String[] args) {
        add(10, 10);
        add(10, 30, 40);
        add(13, 56, 12, 34);
    }
    /*static void add(int x, int y) {
        System.out.println(x + y);
    }

    static void add(int x, int y, int z) {
        System.out.println(x + y + z);
    }
     */

    //variable arguments
    static void add(int... numArray) {
        int sum = 0;
        for (int num :
                numArray) {
            sum += num;
        }
        System.out.println(sum);
    }

}
