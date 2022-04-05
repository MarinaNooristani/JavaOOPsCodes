package com.syntax.class10;

public class Array2Ddemo {

	public static void main(String[] args) {
		int[][] numbers = new int[3][4];
		// 1 row or 1 array
		numbers[0][0] = 12;
		numbers[0][1] = 23;
		numbers[0][2] = 10;
		numbers[0][3] = 67;

		// 2 row or 2 array
		numbers[1][0] = 45;
		numbers[1][1] = 63;
		numbers[1][2] = 19;
		numbers[1][3] = 30;

		// 3 row or 3 array
		numbers[2][0] = 78;
		numbers[2][1] = 43;
		numbers[2][2] = 18;
		numbers[2][3] = 59;

		System.out.println(numbers[1][3]);//30
		System.out.println(numbers[0][2]+numbers[1][1]);//10+63=73

	}

}
