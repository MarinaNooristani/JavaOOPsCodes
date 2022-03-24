package com.syntax.class22;
public class Area {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
     */
    static double area(double length, double width) {
        double rectangleArea = length * width;
        return rectangleArea;
    }
    static double area(double a) {
        double squareArea = Math.pow(a, 2);
        return squareArea;
    }
    static double area(double length, double width, double height) {
        double boxArea = length * width * height;
        return boxArea;
    }
    public static void main(String[] args) {
        System.out.println(area(2, 3));
        System.out.println(area(4));
        System.out.println(area(4, 4, 4));

    }
}


