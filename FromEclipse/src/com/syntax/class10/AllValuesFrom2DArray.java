package com.syntax.class10;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		String[][] food= {
				{"burger","Pizza","Pasta","Fries"},
				{"Biryani","Curry","Butter chicken"},
				{"Noodles","Thai","tom yum"},
				{"steak","redull"}
		};
		
		for(String[] cuisine:food) {
			for(String f:cuisine) {
				System.out.println(f);
			}
		}

	}

}
