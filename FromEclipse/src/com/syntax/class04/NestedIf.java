package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean vaccine = true;
		int dose = 1;

		if (vaccine) {
			System.out.println("How many doses you have");

			if (dose == 1) {
				System.out.println("You need another shot");
			} else {
				System.out.println("You are fully vaccinated");
			}
		} else {
			System.out.println("I do not have any further questions");
		}
       System.out.println("-------------------------------------------------");
       
       /* declare a variable for allergy
        * 
        * if you have allergy-->
        *                       if you have pollen
        *                       if you have peanut
        *                       if you have wheat
        * if no allergy--> you are lucky                      
        */
       
       boolean allergy=true;
       if(allergy) {//outer if
    	   System.out.println("let's check what allergies you have");
    	   
    	   String allergyType="pollen";
    	   //nested if--> always has a dependency on outer if.
    	   //outer if MUST  be true in order for nested if to be checked
    	   if(allergyType.equals("pollen")) {
    		   System.out.println("please stay at home when trees are blooming.");
    		   
    	   }else if(allergyType.equals("peanut")) {
    		   System.out.println("please do not eat food that contains nut.");
    		   
    	   }else if(allergyType.equals("gluten")) {
    		   System.out.println("please follow gluten free diet.");
    		   
    	   }else {
    		   System.out.println("i don't know which suggestion to give you.");
    	   }
    	   
       }else {
    	   System.out.println("you are lucky");
       }
       
       
       
	}

}
