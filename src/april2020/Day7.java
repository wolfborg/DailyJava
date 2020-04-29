package april2020;

/*******************************************************************
 * Problem: Find the unique number
 * Date: April 28th, 2020
 * 
 * 
 * There is an array with some numbers. All numbers are equal except
 * for one. It's guaranteed that array contains at least 3 numbers.
 * 
 * Examples:
 * [ 1, 1, 1, 2, 1, 1 ] => 2
 * [ 0, 0, 0.55, 0, 0 ] => 0.55
 * 
 *******************************************************************/

import java.util.Arrays;

public class Day7 {
	/************************************************************************
	 * My Solution
	 * 
	 * 1. Get the distinct elements in the array.
	 * 2. Compare the first three elements.
	 * 3. Return the unique value based on the comparison.
	 * 
	 * Basically, if the first element is equal to the second or third, then
	 * we know the second distinct is the answer. Distinct is cleaner than a
	 * for loop but it does still iterate over the whole array.
	 * 
	 * Time complexity: O(N)
	 ************************************************************************/
	public static double findUniq(double[] arr) {
		//System.out.println(Arrays.toString(arr));
		double[] d = Arrays.stream(arr).distinct().toArray();
		if (arr[0] == arr[1] || arr[0] == arr[2]) return d[1];
		return d[0];
	}
	
	/************************************************************************
	 * Online Solution
	 * 
	 * 1. Sort the array.
	 * 2. If the first two doubles aren't equal, return first element.
	 * 3. Otherwise, return the last element.
	 * 
	 * This solution seems easier than mine, but it's time complexity is
	 * larger due to the sorting method. This means that it's actually worse
	 * than looping over all elements of the array. It's a clever way to
	 * solve the problem, but not an efficient way.
	 * 
	 * Time complexity: O(N*log(N))
	 ************************************************************************/
	public static double findUniq2(double[] arr) {
		Arrays.sort(arr);
	    return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
	}
	
	public static void problemTests() {
		test(findUniq2(new double[] { 1, 1, 1, 2, 1, 1 }), 2.0);
		test(findUniq2(new double[] { 0, 0, 0.55, 0, 0 }), 0.55);
		test(findUniq2(new double[] { 0, 1, 1, 1, 1, 1, 1, 1 }), 0.0);
		test(findUniq2(new double[] { 0, 1, 0 }), 1.0);
	}
	
	public static boolean test(Object output, Object expect) {
		boolean result = output.equals(expect);
		if (result) { System.out.println("Correct"); }
		else { System.out.println("Incorrect"); }
		System.out.println("Output: " + output);
		System.out.println("Expect: " + expect);
		System.out.println("\n===========================\n");
		return result;
	}
	
	// Run problem tests
	public static void main(String[] args) {
		System.out.println("Running Tests:");
		System.out.println("===========================\n");
		problemTests();
	}
}
