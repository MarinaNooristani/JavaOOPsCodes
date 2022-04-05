package com.syntax.class12;

public class PhoneTester {
	

	public static void main(String[] args) {
		//first java goes here to check for Phone(class) if it is available here
		//if it didn't find then it will check the package 
		//otherwise we need to import
		//then it check the variables and methods
		//ctrl + f to replace all

		Phone samsung = new Phone();
		samsung.make="samsung";
		samsung.price = 399;
		samsung.color = "White";
		samsung.model = "5A";
		samsung.makeCall();
		samsung.takePictures();
		samsung.printCompleteInfo();
	}

	}


