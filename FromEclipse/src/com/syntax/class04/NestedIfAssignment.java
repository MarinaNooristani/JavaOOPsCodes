package com.syntax.class04;

public class NestedIfAssignment {

	public static void main(String[] args) {
		
		boolean diploma=true;
		if(diploma) {
			System.out.println("Congratulations");
			
			double gpaScore=4.5;
			
			if(gpaScore>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else{
				System.out.println("You should have studied harder");
			}
			
		}else {
			System.out.println("Please get a degree");
		}

	}

}
/* if(gpaScore<=3.5) {
 * System.out.println("You should have studied harder");
   
   }else{
   System.out.println("You are eligible for scholarship");
 
   }
*/
