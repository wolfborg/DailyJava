package april2020;

/*******************************************************************
 * Problem: 
 * Date: April 25th, 2020
 * 
 * An isogram is a word that has no repeating letters, consecutive
 * or non-consecutive. Implement a function that determines whether
 * a string that contains only letters is an isogram. Assume the
 * empty string is an isogram. Ignore letter case.
 * 
 * Examples:
 * isIsogram "Dermatoglyphics" == true
 * isIsogram "aba" == false
 * isIsogram "moOse" == false -- ignore letter case
 * 
 *******************************************************************/

import java.util.*;

public class Day4 {
	/************************************************************************
	 * Solution:
	 * 
	 * Convert the string to lowercase so we ignore cases, then make a new
	 * list of characters. Iterate over the string characters, checking if
	 * we already have it. If we do, return false. If we don't, add it to
	 * the list. If we make it throught the whole thing without a duplicate,
	 * we return true.
	 * 
	 * Time complexity: O(N)
	 ************************************************************************/
	
	public static boolean isogram(String str) {
		str = str.toLowerCase();
		List<Character> check = new ArrayList<Character>();
		
		for (char c : str.toCharArray()) {
			if (check.contains(c)) { return false; }
			else { check.add(c); }
		}
		
		return true;
	}
	
	public static void problemTests() {
		test(isogram("Dermatoglyphics"), true);
		test(isogram("aba"), false);
		test(isogram("moOse"), false);
	}
	
	// Run problem tests
		public static void main(String[] args) {
			System.out.println("Running Tests:");
			System.out.println("===========================\n");
			problemTests();
		}
		
		public static boolean test(boolean output, boolean expect) {
			boolean result = output == expect;
			if (result) { System.out.println("Correct"); }
			else { System.out.println("Incorrect"); }
			System.out.println("Output: " + output);
			System.out.println("Expect: " + expect);
			System.out.println("\n===========================\n");
			return result;
		}
}
