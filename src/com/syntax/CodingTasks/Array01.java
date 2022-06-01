package com.syntax.CodingTasks;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {

		// Using Scanner create an array of integer values. After the array is created,
		// calculate the sum of all stored elements in that array.
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Value1 :");
		int value1=input.nextInt();
		System.out.println("value2 : ");
		int value2=input.nextInt();
		System.out.println("value3 : ");
		int value3=input.nextInt();
		System.out.println("value4 : ");
		int value4=input.nextInt();
		
	
		int[] values= {value1+value2+value3+value4};
		int sum=0;
		for (int i=0;i<values.length;i++) {
			sum=sum+values[i];
		}
		System.out.println("Sum of all values = "+sum);

		input.close();
	}

}
