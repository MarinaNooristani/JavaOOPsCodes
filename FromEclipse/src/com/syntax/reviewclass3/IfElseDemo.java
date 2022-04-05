package com.syntax.reviewclass3;

public class IfElseDemo {

	public static void main(String[] args) {
		
		String userName="Marina";
		String password="123$$";//place a debug point, debug as, java application,step over button
		
		if(userName.equals("Marina") && password.equals("124$$")) {//debug window, variable window, watch-->expression window,break point window
			System.out.println("welcome back "+userName);
		}else {
			System.out.println("UserName or Password is not correct");//to stop debugging click on red run button
		}

	}

}
