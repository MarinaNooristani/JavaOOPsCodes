package com.syntax.class10;

public class Array2DTask {

	public static void main(String[] args) {
		String[][] arr=new String[2][4];
		//1 row
		arr[0][0]="Mr";
		arr[0][1]="Mrs";
		arr[0][2]="Ms";
		arr[0][3]="Miss";
		
		//2 row
		arr[1][0]="Smith";
		arr[1][1]="Jordan";
		arr[1][2]="Jackson";
		arr[1][3]="Obama";
		
		System.out.println(arr[0][1]+" "+arr[1][0]+", "+arr[0][0]+" "+arr[1][3]+", "+arr[0][2]+" "+arr[1][2]+", "+arr[0][3]+" "+arr[1][1]+".");
		
	}

}
