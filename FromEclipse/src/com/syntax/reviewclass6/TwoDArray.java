package com.syntax.reviewclass6;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] array = new int[2][3];
		// 1 row
		array[0][0] = 10;
		array[0][1] = 20;
		array[0][2] = 30;
		
		//2 row
		array[1][0] = 1;
		array[1][1] = 2;
		array[1][2] = 3;
		
		System.out.println(array.length);
		int[][] numbers= {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] nums:numbers) {
			for(int num:nums) {
				System.out.print(num+" ");
			}
			System.out.println("");
		}
		int[] arr= {12,45,67,3};
		//sort the array
		Arrays.sort(arr);//Arrays object  sort method  arr argument
		System.out.println(arr[arr.length-1]);//4-1=3  arr[3]
		//void return type that does not return any value
		
		
	}

}
