package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {

		char choice = 'y';
		String answer;

		switch (choice) {
		case 'y':
			answer = "Yes";
			break;
		case 'n':
			answer = "No";
			break;
		case 'm':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		}
		System.out.println(answer);
		
		System.out.println("----------------------");
		//
		String car="LADA";
		String country;
		
		switch(car.toLowerCase()) {
		
		case "bmw":
			country="Germany";
			break;
		case "ford":
			country="USA";
			break;
		case "lada":
			country="Russia";
			break;
		case "toyota":
			country="Japan";
			break;
		default:
			country="Unknown country";
			
		}
		System.out.println(car+" is from "+country);
		
	}
	}
