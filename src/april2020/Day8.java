package april2020;

import java.util.stream.IntStream;

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
	 * 1. Check for 0, return 0.00 if found
	 * 2. Loop through the series, with x=4 and num=1
	 * 3. Each loop decrements n and adds 3 to x
	 * 4. Loop adds the current x value into the sum
	 * 5. Returns 2 decimal point string
	 * 
	 * I feel like there's definitely a cleaner way to simplify this. Though
	 * it looks like most solutions online are very similar to this.
	 * 
	 * Time complexity: O(N)
	 ************************************************************************/
	public static String solution(int n) {
		double num = 0.0;
		for (int i=0; i<n; i++)
			num += 1.0 / (1+i*3);
		return String.format("%.2f", num);
	}
	
	/************************************************************************
	 * Online Solution
	 * 
	 * New stuff:
	 * IntStream.range(x,y) - Creates an IntStream range from int x to int y
	 * IntStream.mapToDouble() - Returns DoubleStream results of a function
	 * DoubleStream.sum() - Adds the stream together
	 * 
	 * 1. Create an IntStream using a range from 0 to n
	 * 2. Convert the stream to a DoubleStream
	 * 3. Apply the series function to the stream
	 * 4. Add the stream together to get answer
	 * 5. Return the answer as a 2 decimal String
	 * 
	 * A cleaner solution, but essentially does the same thing as mine. Seems
	 * like streams are the way for a lot of clean solutions online. That and
	 * learning how to apply functions as a parameter could improve skills.
	 * 
	 * Time complexity: O(N)
	 ************************************************************************/
	public static String solution2(int n) {
		return String.format("%.2f",
			IntStream.range(0, n)
			.mapToDouble(num -> 1.0 / (1 + num * 3))
			.sum());
	}
	
	public static void problemTests() {
		Test.test(solution(1), "1.00");
		Test.test(solution(2), "1.25");
		Test.test(solution(5), "1.57");
		Test.test(solution(0), "0.00");
	}
	
	
	
	// Run problem tests
	public static void main(String[] args) {
		System.out.println("Running Tests:");
		System.out.println("===========================\n");
		problemTests();
	}
}