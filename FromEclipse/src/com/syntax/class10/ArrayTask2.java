package com.syntax.class10;

public class ArrayTask2 {

	public static void main(String[] args) {
		
		String[] countries = { "Turkey", "USA", "Italy", "France" };

		int size = countries.length;
		String capital = null;
		for (int i = 0; i < size; i++) {

			switch (countries[i]) {
			case "Turkey":
				capital = "Ankara";
				break;
			case "USA":
				capital = "Washington DC";
				break;
			case "Italy":
				capital = "Rome";
				break;
			case "France":
				capital = "Paris";
				break;

			}
			System.out.println("The capital of " + countries[i] + " is " + capital);
		}
		System.out.println("________________________________________");
		// using else if and for each loop
		for (String country : countries) {
			if (country.equals("Turkey") ) {
				capital = "Ankara";
			} else if (country.equals("USA")) {
				capital = "Washington DC";
			} else if (country.equals("Italy")) {
				capital = "Rome";
			} else if (country.equals("Paris")) {
				capital = "Paris";
			}
			System.out.println("The capital of " + country + " is " + capital);
		}

	}

}
