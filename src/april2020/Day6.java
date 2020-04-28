package april2020;

/*******************************************************************
 * Problem: Your order, please
 * Date: April 27th, 2020
 * 
 * Your task is to sort a given string. Each word in the string
 * will contain a single number. This number is the position the
 * word should have in the result.
 * 
 * Note: Numbers can be from 1 to 9. So 1 will be the first word
 * (not 0). If the input string is empty, return an empty string.
 * The words in the input String will only contain valid consecutive
 * numbers.
 * 
 * Examples:
 * "is2 Thi1s T4est 3a" --> "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2" --> "Fo1r the2 g3ood 4of th5e pe6ople"
 * "" --> ""
 *******************************************************************/

public class Day6 {
	/************************************************************************
	 * My Solution:
	 * 
	 * Breakdown:
	 * 
	 * 
	 * Time complexity: 
	 ************************************************************************/
	public static String order(String words) {
		String order = "";
		
		
		
		return order;
	}
	
	/************************************************************************
	 * Online Solution:
	 * 
	 * 
	 * 
	 * Breakdown:
	 * 
	 * 
	 * Explained:
	 * 
	 * 
	 * Time complexity: 
	 ************************************************************************/
	public static String order2(String words) {
	    return "";
	}
	
	public static void problemTests() {
		test(order("is2 Thi1s T4est 3a"), "Thi1s is2 3a T4est");
		test(order("4of Fo1r pe6ople g3ood th5e the2"), "Fo1r the2 g3ood 4of th5e pe6ople");
		test(order(""), "");
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
