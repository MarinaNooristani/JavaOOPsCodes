package com.syntax.reviewclass2;

public class StringConcatDemo1 {

	public static void main(String[] args) {
		String name="10";
		int number=10;
		char letter='A';//Java sometimes treats it as a number/character
		System.out.println(letter+number+name);//65+10=75-->addition-->75+"10"=7510-->concatenation
		System.out.println(letter+name+number);//'A'+"10"=A10-->concatenation-->"A10"+10=A1010-->concatenation
		System.out.println(10+10+"10");
		System.out.println(10+"10"+10+10);
		System.out.println(10+"10"+10+10+10);
		System.out.println(10+10+"10"+10+10);
		System.out.println(10+"10"+10+10);
		System.out.println(10+"10"+(10+10));//the priority will be given to the parenthesis
	

}
}