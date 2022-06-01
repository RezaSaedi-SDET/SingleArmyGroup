package com.syntax.CodingTasks;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {

		// Using Scanner create an array of countries. When an array is created,
		// retrieve all values from it and while retrieving those values print capital
		// for each country. (use 2 different loops).

		Scanner input=new Scanner(System.in);
		
		System.out.print("1st country :");
		String value1=input.nextLine();
		System.out.print("2nd country :");
		String value2=input.nextLine();
		System.out.print("3rd country :");
		String value3=input.nextLine();
		System.out.print("4th country :");
		String value4=input.nextLine();
		
		String[] countries= {value1, value2, value3, value4};
		for (int i=0;i<countries.length;i++) {
			System.out.print("Capital of "+countries[i]);
			@SuppressWarnings("unused")
			String capital=input.nextLine();
			

		}
		
		System.out.println("--------------------------------------------------------- ----------------------------");
		
		for(String name:countries) {
			System.out.println("Capital of "+name);
			String capital=input.nextLine();
		}
			
		input.close();
		
		
	}

}
