package april2020;

/*******************************************************************
 * Problem: Find the unique number
 * Date: April 28th, 2020
 * 
 * There is an array with some numbers. All numbers are equal except
 * for one. It's guaranteed that array contains at least 3 numbers.
 * 
 * Examples:
 * [ 1, 1, 1, 2, 1, 1 ] => 2
 * [ 0, 0, 0.55, 0, 0 ] => 0.55
 * 
 *******************************************************************/


public class Day7 {
	/************************************************************************
	 * My Solution
	 * 
	 * 1. 
	 * 
	 * Time complexity: 
	 ************************************************************************/
	public static double findUniq(double arr[]) {
		return 0;
	}
	
	/************************************************************************
	 * Online Solution
	 * 
	 * 1. 
	 * 
	 * Time complexity: 
	 ************************************************************************/
	public static double findUniq2(double arr[]) {
		return 0;
	}
	
	public static void problemTests() {
		test(findUniq(new double[] { 1, 1, 1, 2, 1, 1 }), 2);
		test(findUniq(new double[] { 0, 0, 0.55, 0, 0 }), 0.55);
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
