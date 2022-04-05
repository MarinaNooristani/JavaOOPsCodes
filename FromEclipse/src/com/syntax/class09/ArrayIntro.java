package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		//creating an array that holds 4 elements
		int[] numbers=new int[4];
		//storing values/elements inside an array
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=71;
		numbers[3]=13;
		
		//print 99
		System.out.println(numbers[3]);
		System.out.println(numbers[3]+numbers[0]);//103
		
		//creating another array
		String[] countries=new String[5];
		countries[0]="USA";
		countries[1]="Canada";
	    countries[2]="Afghanistan";
	    countries[3]="Morroco";
	    countries[4]="Turkey";
	    //countries[5]="London";arrays are fixed in size
	    //System.out.println(countries[5]);
	    System.out.println(countries[3]);
	    System.out.println(countries[4]+countries[0]);
	    
	    //
	    String[] names=new String[5];
	    names[1]="Orsan";
	    names[2]="Marina";
	    names[3]="Gulnar";
	    System.out.println(names[0]);
	    System.out.println(names[1]);//Orsan
	    names[1]="Daniyar";
	    System.out.println(names[1]);
	    
	    
	    //create an array to store 4 different prices 
	    //and find an average of how much we spent
	    
	    double[] prices=new double[4];
	    prices[0]=50.7;
	    prices[1]=45.3;
	    prices[2]=62.9;
	    prices[3]=85.6;
	    System.out.println(prices[0]+prices[1]+prices[2]+prices[3]/4);
		
	
		
		
	}

}
