package com.syntax.reviewclass6;

public class NestedLoops {

	public static void main(String[] args) {
		
     for(int i=1; i<=3; i++) {
    	 for(int j=1; j<3; j++ ) {
    		 System.out.println(i+" "+j);
    	 }
     }
     System.out.println("_____Multiplication table____");
     for(int i=1; i<10; i++) {
    	 for(int j=1; j<=10; j++) {
    		 System.out.println(i+" X "+j+" = "+ i*j);
    	 }
    	 System.out.println("________________________");
     }
     
	}

}
