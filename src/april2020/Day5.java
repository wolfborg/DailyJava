package april2020;

/*******************************************************************
 * Problem: Persistent Bugger
 * Date: April 26th, 2020
 * 
 * Write a function, persistence, that takes in a positive
 * parameter n and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits
 * in n until you reach a single digit.
 * 
 * Examples:
 * persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 *  					// and 4 has only one digit
 *  
 * persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 *                     	 // 1*2*6 = 12, and finally 1*2 = 2
 * 
 * persistence(4) == 0 // because 4 is already a one-digit number
 *******************************************************************/

public class Day5 {
	/************************************************************************
	 * My Solution:
	 * 
	 * 
	 * 
	 * Time complexity: 
	 ************************************************************************/
	
	public static int persistence(long n) {
		return -1;
	}
	
	/************************************************************************
	 * Online Solution:
	 * 
	 * 
	 * 
	 * Time complexity: 
	 ************************************************************************/
	public static int persistence2(long n) {
		return -1;
	}
	
	public static void problemTests() {
		test(persistence(39), 3);
		test(persistence(999), 4);
		test(persistence(4), 0);
	}
	
	public static boolean test(int output, int expect) {
		boolean result = output == expect;
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
