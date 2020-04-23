package april2020;

/*******************************************************************
 * Problem 1: Log sorting
 * Date: April 22nd, 2020
 * A string log is given to you with the first part being a unique
 * alphanumeric identifier and the rest either being a string of
 * lowercase English words or integers. Sort the logs so that the
 * word logs come before the integer logs. Keep the integers in the
 * same order, but sort the words alphabetically. In the case of a
 * tie for the words, sort by their identifier.
 *******************************************************************/

import java.util.*;

public class Day1 {
	
	public static void main(String[] args) {
		problem1();
	}
	
	public static List<String> logSorting(int numLines, List<String> loglines) {
		// Solution here
		return new ArrayList<String>();
	}
	
	public static void problem1() {
		// Run problem tests
		List<String> test1input = new ArrayList<String>(Arrays.asList("a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"));
		List<String> test1expected = new ArrayList<String>(Arrays.asList("g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"));
		assertProblem1(test1input, test1expected);
	}
	
	public static void assertProblem1(List<String> input, List<String> expected) {
		System.out.println("Assessing problem1:\n");
		
		List<String> output = logSorting(input.size(), input);
		
		System.out.println("Input:"); printLogs(input); System.out.println();
		System.out.println("Output:"); printLogs(output); System.out.println();
		System.out.println("Expected:"); printLogs(expected); System.out.println();
		
		if (output == expected) { System.out.println("Correct"); }
		else { System.out.println("Incorrect"); }
		
		System.out.println();
	}
	
	public static void printLogs(List<String> loglines) {
		for (String s : loglines) {
			System.out.println(s);
		}
	}
}
