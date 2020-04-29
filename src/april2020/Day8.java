package april2020;

import java.util.Arrays;

public class Day8 {
	/*******************************************************************
	 * Problem: Sum of the first nth term of Series
	 * Date: April 29th, 2020
	 * 
	 * Your task is to write a function which returns the sum of
	 * following series upto nth term(parameter).
	 * 
	 * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
	 * 
	 * Rules:
	 * You need to round the answer to 2 decimal places and return it as
	 * String. If the given value is 0 then it should return 0.00. You
	 * will only be given Natural Numbers as arguments.
	 * 
	 * Examples:
	 * SeriesSum(1) => 1 = "1.00"
	 * SeriesSum(2) => 1 + 1/4 = "1.25"
	 * SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
	 *******************************************************************/
	
	/************************************************************************
	 * My Solution
	 * 
	 * 1. 
	 * 
	 * 
	 * 
	 * Time complexity: 
	 ************************************************************************/
	public static String solution(int n) {
		return "";
	}
	
	/************************************************************************
	 * Online Solution
	 * 
	 * 1. 
	 * 
	 * 
	 * 
	 * Time complexity: 
	 ************************************************************************/
	public static Object solution2(Object a) {
		return a;
	}
	
	public static void problemTests() {
		Test.test(solution(1), "1.00");
		Test.test(solution(2), "1.25");
		Test.test(solution(5), "1.57");
	}
	
	
	
	// Run problem tests
	public static void main(String[] args) {
		System.out.println("Running Tests:");
		System.out.println("===========================\n");
		problemTests();
	}
}