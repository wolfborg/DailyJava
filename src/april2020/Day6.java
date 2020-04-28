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

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Day6 {
	/************************************************************************
	 * My Solution
	 * 
	 * 1. If words is empty, return it
	 * 2. Split up the words by spaces into an list
	 * 3. For loop:
	 * 		- Starts with i=0 and n=0
	 * 		- Loops through the wordsList
	 * 		- Each loop increments i by 1
	 * 4. Loop goes until it finds the current number (n) in a word.
	 * 5. When it finds the word, appends it and remove from wordsList
	 * 6. Reset i and increment n
	 * 7. Continue until wordsList is empty.
	 * 8. Return ordered String.
	 * 
	 * Time complexity: O(N^2)
	 ************************************************************************/
	public static String order(String words) {
		if (words == "") { return words; }
		
		String ordered = "";
		List<String> wordsList = new ArrayList<String>(Arrays.asList(words.split(" ")));
		for (int i=0, n=1; i<wordsList.size(); i++) {
			String word = wordsList.get(i);
			if (word.contains(Integer.toString(n))) {
				ordered += word + " ";
				wordsList.remove(i);
				i=-1; n++;
			}
		}
		
		return ordered.trim();
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
