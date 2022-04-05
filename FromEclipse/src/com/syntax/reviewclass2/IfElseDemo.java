package com.syntax.reviewclass2;

public class IfElseDemo {

	public static void main(String[] args) {
		
		boolean flag=true;
		
		if(false) { //directly to put a condition:if true line 10 will be executed if false line 12
			System.out.println("this is true");
		}else {
			System.out.println("this is false");
		}
		/********************************************/
		 if(flag) {
			 System.out.println("only display if it is true");
		 }else{
			 System.out.println("only display if it is false");
		 }
		
	}

}
