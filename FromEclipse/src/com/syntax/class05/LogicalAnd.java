package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		boolean likeJava=true;
		boolean understandJava=true;
		boolean practice=false;
		
		if(likeJava && understandJava && practice) {//ampersand and logical operator
			System.out.println("This is the best combination");
		}
		
		System.out.println("End of the code");
		
		//we want to compare 3 numbers
		int num1=12;
		int num2=34;
		int num3=21;
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is the largest");
		}else if(num2>num1 && num2>num3){
			System.out.println(num2+" is the largest");
		}else if(num3>num1 && num3>num2){
			System.out.println(num3+" is the largest");
		}

	}

}
