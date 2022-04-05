package com.syntax.class10;

public class AllFrom2DArray {

	public static void main(String[] args) {
		 
		String[][] food= {
				{"burger","Pizza","Pasta","Fries"},
				{"Biryani","Curry","Butter chicken"},
				{"Noodles","Thai","tom yum"},
				{"steak","redull"}
		};
		for(int row=0; row<food.length; row++) {
			for(int column=0; column<food[row].length; column++) {
				System.out.println(food[row][column]);
			}
		}

	}

}
