package com.syntax.CodingTasks;

public class Array03 {

	public static void main(String[] args) {

		// Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] num= {{0,5,15},{20,50,70}};
		int sum=0;
		for (int i=0;i<num.length;i++) {
			for (int j=0;j<num[0].length;j++) {
				sum+=num[i][j];
			}
		}
		
		System.out.println("Sum = "+sum);
		
	}

}
