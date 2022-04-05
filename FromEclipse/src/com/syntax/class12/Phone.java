package com.syntax.class12;

public class Phone {
	String make;
	double price;
	String color;
	String model;

	void makeCall() {
		System.out.println("Making a call");
	}

	void takePictures() {
		System.out.println("Taking pictures");
	}

	void printCompleteInfo() {
		System.out.println("Make = "+make);
		System.out.println("Price = " + price);
		System.out.println("Color = " + color);
		System.out.println("Model = " + model);
	}

	public static void main(String[] args) {
		Phone iphone = new Phone();
		iphone.make="Apple";
		iphone.price = 1099;
		iphone.color = "Black";
		iphone.model = "13 Pro Max";
		iphone.makeCall();
		iphone.takePictures();
		iphone.printCompleteInfo();

		Phone pixel = new Phone();
		pixel.make="Pixel";
		pixel.price = 399;
		pixel.color = "White";
		pixel.model = "5A";
		pixel.makeCall();
		pixel.takePictures();
		pixel.printCompleteInfo();

		Phone nokia = new Phone();
		nokia.make="Nokia";
		nokia.price = 200;
		nokia.model = "G20";
		nokia.color = "Blue";
		nokia.makeCall();
		nokia.takePictures();
		nokia.printCompleteInfo();

	}

}
