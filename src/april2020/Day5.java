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
	 * If n is already less than 10, return zero. Otherwise, continue.
	 * Convert the long to a string and initialize a m long with n and start
	 * a count at zero. Loop until the m value is less than ten. In each loop,
	 * we convert the current long n into a string and set m to one. Iterate
	 * over each char of the string, convert them to integers, and multiply
	 * them into m. Set n to m. Increment count at the end of each loop.
	 * Return the final count.
	 * 
	 * Time complexity: O(N)
	 ************************************************************************/
	
	public static int persistence(long n) {
		if (n < 10) { return 0; }
		
		String s = "";
		long m = n;
		int count = 0;
		
		while (m >= 10) {
			s = Long.toString(n); m = 1;
			for (char c : s.toCharArray())
				m *= Integer.parseInt(Character.toString(c));
			n = m; count++;
		}
		
		return count;
	}
	
	/************************************************************************
	 * Online Solution:
	 * 
	 * This solution uses recursion to simplify the work.
	 * 
	 * Breakdown:
	 * 1. Set long m to 1 and r to n
	 * 2. If r divided by 10 is 0, return 0
	 * 3. Start for loop:
	 * 		- Starts with r = n
	 * 		- Loops until r = 0
	 * 		- Each loop sets r = r / 10
	 * 4. Loop sets m = (m * r) % 10
	 * 5. After loop, return persistence(m) + 1
	 * 
	 * Explained:
	 * This uses modulo and division to shift through the digits of the long
	 * variables. r is used to determine the digit shift while m is used to
	 * multiply the new digits into it. Dividing by ten can remove the last
	 * digit of a long. Modulo by ten can return the second digit without
	 * shifting the entire long.
	 * 
	 * The recusrion is used to keep count of the number of times we multiply,
	 * because in the end only the ones that are returned with each recursion
	 * get added into the final return. This is because the final m will always
	 * return zero once we finally reach the point where r is zero.
	 * 
	 * Time complexity: O(N)
	 ************************************************************************/
	public static int persistence2(long n) {
		long m = 1, r = n;

	    if (r / 10 == 0)
	      return 0;
	
	    for (r = n; r != 0; r /= 10)
	      m *= r % 10;
	
	    return persistence2(m) + 1;
	}
	
	public static void problemTests() {
		test(persistence(39), 3);
		test(persistence(999), 4);
		test(persistence(4), 0);
		test(persistence(25), 2);
		test(persistence(10), 1);
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
