package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			System.out.println("i am code inside loop " + i);

			break;// keyword, get out of this block of code, exit this block of code
		}

		System.out.println("End of the code");
		/********************************/

		boolean winter = true;

		while (winter) {// infinite/non stop loop
			System.out.println("It's cold");
			break;
		}

		/**********************************/

		for (int i = 1; i <= 5; i++) {
			System.out.println("i am code inside loop ");
			if (i == 2) {
				break;// gets out of the entire loop code
			}
		}
		/***********************************/
		winter = true;
		int temp = 0;

		while (winter) {// infinite/non stop loop
			System.out.println("It's cold " + temp);
			if (temp == 20) {
				break;
			}
			temp += 5;
		}
	}

}
