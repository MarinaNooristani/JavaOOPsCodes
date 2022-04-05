package com.syntax.reviewclass5;

public class ForDemo4 {

	public static void main(String[] args) {

//		int x=0;
//		while(x<5) {
//			break;//it does not make sense to use without if 
//			System.out.println("1");//can not compile your code
//			x++;
//		}
		
	//	replit
//		int[][] a = {
//				{-5,-2,-3,7},
//				{1,-5,-2,2},
//				{1,-2,3,-4}
//			};
//	    int count=0;
//	    
//	    for(int i=0; i<a.length; i++){
//	      for(int j=0; j<a[i].length; j++){
//	      if(a[i][j]<0 && a[i][j]%2!=0){
//	       count++;
//	       
//	      }
//	      }
//	    }
//	    System.out.println(count);
//		replit
//		int[][] a = {
//				{-5,-2,-3,7},
//				{1,-5,-2,2},       
//				{1,-2,3,-4}
//			};
//			 int sum=0;
//			 for(int i=0; i<a.length; i++){
//	       if(i%2==0){
//	       for(int j=0; j<a[i].length; j++){
//	        if(j%2==0){
//	         sum+=a[i][j];
//	        }
//	       }
//	     }
//	     }
//
//			System.out.println(sum);
	for (int i = 7; i >= 1; i--) {
		System.out.println("");
		for (int j = 1; j <= i; j++) {
			System.out.print(j + " ");
		}

	}
	for (int i = 1; i <= 7; i++) {
		for (int j = 1; j <= i; j++) {
			if (i == 1) {
				continue;
			}
			System.out.print(j + " ");
		}
		System.out.println();
	}
	}
}