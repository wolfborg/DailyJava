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
import java.util.Comparator;

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
	 * Online Solution
	 * 
	 * New Stuff:
	 * Arrays.stream() - returns a stream from a given array
	 * Stream.sorted() - returns sorted stream using comparator
	 * Comparator.comparing() - returns a comparator extracted from a sort key
	 * Integer.valueOf() - returns integer value representing a string
	 * String.replaceAll() - replaces all of a substring with a new substring
	 * Stream.reduce() - reduces the elements of the stream
	 * Optional.get() - returns a value if it's present
	 * 
	 * Breakdown:
	 * 1. Split words into string array.
	 * 2. Convert string array into a stream.
	 * 3. Run a sort function on the stream.
	 * 4. Use a comparing function to sort stream.
	 * 		- Remove everything but digits from the words.
	 * 		- Sort by the integer value of the leftover word.
	 * 5. Reduce elements as a means of joining the stream again.
	 * 6. Get the final String and return it.
	 * 
	 * Explained:
	 * This solution seems simple and clean, but there's a couple small issues
	 * with it. The replaceAll happens during the sorting algorithm multiple
	 * times, making it really inefficient. And instead of reduce, join should
	 * be used instead.
	 * 
	 * Time complexity: O(N*log(N))
	 ************************************************************************/
	public static String order2(String words) {
	    return Arrays.stream(words.split(" "))
	      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
	      .reduce((a, b) -> a + " " + b).get();
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
