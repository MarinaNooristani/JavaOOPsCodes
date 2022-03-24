package com.syntax.class21;

public class HW2 {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
     In circle class create a method to calculate the area of circle. Test your code
     */
    public static void main(String[] args) {
        CircleClass circleClass = new CircleClass(5);
        circleClass.calculateAreaOfCircle();
    }
}

class ShapeClass {
    int radius;

    ShapeClass(int radius) {
        this.radius = radius;
    }
}

class CircleClass extends ShapeClass {
    CircleClass(int radius) {
        super(radius);
    }

    void calculateAreaOfCircle() {
        System.out.println(Math.PI * Math.pow(radius, 2));

    }
}

