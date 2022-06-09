package com.syntax.CodingTasks;

import java.util.Scanner;

public class Practiceboard {

	public static void main(String[] args) {
//		
		/*
		 * Create an int array of integers with a size of 5 and input values with
		 * Scanner.
		 * 
		 * Don't print prompt questions for a user.
		 * 
		 * Using loop print out each element of the array that should look like the
		 * output below
		 * 
		 * Example:
		 * 
		 * Input:
		 * 
		 * 1
		 * 
		 * 2
		 * 
		 * 3
		 * 
		 * 4
		 * 
		 * 5
		 * 
		 * Output: 10 20 30 40 50
		 */
//		Scanner input=new Scanner(System.in);
//		int num1=input.nextInt();
//		int num2=num1+9;
//		int num3=input.nextInt();
//		int num4=num3+18;
//		int num5=input.nextInt();
//		int num6=num5+27;
//		int num7=input.nextInt();
//		int num8=num5+37;
//		int num9=input.nextInt();
//		int num10=num5+47;
//		
//		int[] arr={num2, num4,num6, num8,num10};
//		
//		for (int i=0;i<=4;i++) {
//			System.out.println(arr[i]);
//		}

		/*
		 * Create an array of integers that will store 5 elements taken from a user
		 * 
		 * Don't print any prompt message for the user
		 * 
		 * Then print out all the elements you have created in the first loop in reverse
		 * order.
		 * 
		 * Example:
		 * 
		 * Input: 1 2 3 4 5 Output: 5 4 3 2 1
		 */
//		int[] arr= {1, 2, 3, 4, 5};
//		for (int i=4;i>=0;i--) {
//			System.out.println(arr[i]);
//		};

		/*
		 * Write a program that creates a String array with size 7.
		 * 
		 * Ask the user to input Days of a week beginning with Sunday using Scanner
		 * class.
		 * 
		 * Add these inputs to your array and then print all values from that array
		 * 
		 * Example:
		 * 
		 * Please enter day 1 of the week
		 * 
		 * Sunday
		 * 
		 * Please enter day 2 of the week
		 * 
		 * Monday
		 * 
		 * Please enter day 3 of the week
		 * 
		 * Tuesday etc
		 * 
		 * Example Output:
		 * 
		 * Please enter day 1 of the week Sunday Please enter day 2 of the week Monday
		 * Please enter day 3 of the week Tuesday Please enter day 4 of the week
		 * Wednesday Please enter day 5 of the week Thursday Please enter day 6 of the
		 * week Friday Please enter day 7 of the week Saturday Sunday Monday
		 */

//		Scanner input=new Scanner(System.in);
//		System.out.println("Please enter day 1 of the week");	
//		String day1=input.nextLine();
//		System.out.println("Please enter day 2 of the week");	
//		String day2=input.nextLine();
//		System.out.println("Please enter day 3 of the week");	
//		String day3=input.nextLine();
//		System.out.println("Please enter day 4 of the week");	
//		String day4=input.nextLine();
//		System.out.println("Please enter day 5 of the week");	
//		String day5=input.nextLine();
//		System.out.println("Please enter day 6 of the week");	
//		String day6=input.nextLine();
//		System.out.println("Please enter day 7 of the week");	
//		String day7=input.nextLine();
//
//		String[] arr= {day1, day2, day3, day4, day5, day6, day7};
//		for (int i=0;i<=6;i++) {
//			System.out.println(arr[i]+" ");
//		};

		/*
		 * Using the following array.
		 * 
		 * {45, 78, 12, 67, 55, 89, 23, 77, 88}
		 * 
		 * Create a for loop to extract values from that array so your output looks as
		 * below:
		 ** 
		 * Expected Output:** 78 55 77 Note: Find out what is the start point an how
		 * much you need to increment to get the result.
		 */
//		String[] arr= {"45", "78", "12", "67", "55", "89", "23", "77", "88"};
//		for (int i=1;i<=8;i+=3) {
//			System.out.print(arr[i]+" ");
//		};

		/*
		 * Write a program that creates an array of integers of size 11. Add the years
		 * 2010 to 2020 to your array one by one using a for loop and then print all
		 * those values.
		 * 
		 * Example:
		 * 
		 * 2010 2011 2012 2013 2014 2015 2016 2017 2018 2019 2020
		 */

//		String [] year= {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020",};
//		for (int i=0;i<=10;i++) {
//			System.out.println(year[i]);
//		};

		/*
		 * Write a program that creates an array of strings with the following
		 * values{"This", "is", "array", "of", "strings"} and prints all values in one
		 * line.
		 ** 
		 * Output:** This is array of strings
		 */

//		String[] word= {"This", "is", "array", "of", "strings"};
//		for (int i=0;i<=4;i++) {
//			System.out.print(word[i]+" ");
//		};
//		

		/*
		 * Write a program that creates an array with the following values{s, a, y, b,
		 * n, c, t, d, a, e, x}
		 * 
		 * Print the values so the output should look like below
		 ** 
		 * Output:** syntax
		 */

//		String [] value= {"s", "a", "y", "b", "n", "c", "t", "d", "a", "e", "x"};
//		int i;
//		for (i=0;i<=10;i+=2) {
//			System.out.print(value[i]);
//		}

		/*
		 * Write a program that creates an array of integers that stores the following
		 * values: 45,78, 12, 67, 55, 89, 23, 77, 88 Print only values that stored with
		 * even index including 0.
		 */
//		int[] arr = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
//		for (int i = 0; i <= 8; i += 2) {
//			System.out.print(arr[i] + " ");
//		}

		/*
		 * Write a program that creates an array of integers and stores the following
		 * values: 45, 78, 12, 67, 55 and then prints all array values.
		 */
//		int[] arr = {45,78,12,67,55};
//		for (int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		};

//	        int i=1;
//	        for (i=1;i<=7;i++){
//	            System.out.print(i+" ");
//	        };  System.out.println(" ");
//	        for (i=1;i<=6;i++){
//	            System.out.print(i+" ");
//	        };  System.out.println(" ");
//	        for (i=1;i<=5;i++) {
//	            System.out.print(i + " ");
//	        };  System.out.println(" ");
//	        for (i=1;i<=4;i++) {
//	            System.out.print(i + " ");
//	        };  System.out.println(" ");
//	        for (i=1;i<=3;i++) {
//	            System.out.print(i + " ");
//	        };  System.out.println(" ");
//	        for (i=1;i<=2;i++) {
//	            System.out.print(i + " ");
//	        };  System.out.println(" ");
//	            System.out.print(i=1);
//	            System.out.println(" ");
//	        for (i=1;i<=2;i++) {
//	            System.out.print(i + " ");
//	        };  System.out.println(" ");
//	        for (i=1;i<=3;i++) {
//	            System.out.print(i + " ");
//	        };  System.out.println(" ");
//	        for (i=1;i<=4;i++) {
//	            System.out.print(i + " ");
//	        };  System.out.println(" ");
//	        for (i=1;i<=5;i++) {
//	            System.out.print(i + " ");
//	        };  System.out.println(" ");
//	        for (i=1;i<=6;i++) {
//	            System.out.print(i + " ");
//	        };  System.out.println(" ");
//	        for (i=1;i<=7;i++) {
//	            System.out.print(i + " ");
//	        };  System.out.println(" ");

	}
}
