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
	 * My Solution:
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
	
	
	/************************************************************************
	 * Online Solution:
	 * 
	 * This was the cleanest and simplest solution I found online after I
	 * submitted my solution. I'm including it here because I want to study
	 * it and learn from it for future implementation.
	 * 
	 * Here's a breakdown of what's happening here:
	 * String.length() - returns length of string
	 * String.toLowerCase() - helps us ignore cases
	 * String.chars() - returns IntStream of zero-extending chars
	 * IntStream.distinct() - returns IntStream of distinct elements
	 * IntStream.count() - returns count of IntStream elements
	 * 
	 * To put it all together:
	 * Ignore the case, split it into chars as an IntStream, use IntStream's
	 * distinct function to remove all duplicate chars, and compare both the
	 * lengths of the original string and the length of the distrinct stream.
	 * Makes sense because if there were any duplicates, the lengths wouldn't
	 * be the same. Pretty clever!
	 * 
	 * Time complexity: O(N)
	 ************************************************************************/
	public static boolean isogram2(String str) {
		return str.length() == str.toLowerCase().chars().distinct().count();
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
