package com.syntax.reviewclass4;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String month="Jan";//null
      int day=1;
      if("Jan".equals(month)) {
    	  if(day==1) {
    	  System.out.println("It is the first of jan");
    	  }else {
    	  System.out.println("It is jan but not first of jan");//we cannot use logical because of this line
    	  }
      }else {
    	  System.out.println("It is not jan");
      }
      
	}

}
