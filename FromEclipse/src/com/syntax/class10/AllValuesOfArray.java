package com.syntax.class10;

public class AllValuesOfArray {

	public static void main(String[] args) {
		//to retrieve all elements from 2D Array
		int[][] numbers = {
				{ 10, 20,  }, // array 1
				{ 100, 200, 300 }, // array 2
				{ 1000, 2000, 3000, 4000 }// array 3
		};
       int size=numbers.length;
       System.out.println("numbers of 1d array inside 2d array = "+size);
       
       int sizeArray1=numbers[0].length;
       System.out.println("numbers of elements in first array = "+sizeArray1);
       
       int sizeArray2=numbers[1].length;
       System.out.println("numbers of elements in second array = "+sizeArray2);
       
       int sizeArray3=numbers[2].length;
       System.out.println("numbers of elements in third array = "+sizeArray3);
       
       //to retrieve all elements from 2d array we use nested loop
       
       for(int i=0; i<numbers.length; i++) {
    	   for(int j=0; j<numbers[i].length; j++) {
    		   System.out.println(numbers[i][j]);
    	   }
       }
       
	}

}
