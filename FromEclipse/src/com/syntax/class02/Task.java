package com.syntax.class02;

public class Task {

	public static void main(String[] args) {
		// ctrl+shiftt+f to format
		double x = 12.56;
		double y = 5.45;
		double sum = x + y;
		double sub = x - y;
		double multi = x * y;
		double div = x / y;
		System.out.println("The addition of " + x + " and " + y + " is equal to " + sum);
		System.out.println("The subrtaction of " + x + " and " + y + " is equal to " + sub);
		System.out.println("The multiplication of " + x + " and " + y + " is equal to " + multi);
		System.out.println("The division of " + x + " and " + y + " is equal to " + div);
		// square of 3.9
		double z = 3.9;
		double square = z * z;
		System.out.println("The square of the " + z + " is " + square);
		// area and perimeter of a rectangle
		int width = 5;
		int height = 3;
		int area = width * height;
		int perimeter = 2 * (height + width);
		System.out.println("The perimeter of rectangle with width " + width + " and height " + height + " is equal to "
				+ perimeter + " and the area is " + area);
	}

}
