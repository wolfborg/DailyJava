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
		// Initialize empty lists for newLog and sorting
		List<String> newLog = new ArrayList<String>();
		List<String[]> wordLog = new ArrayList<String[]>();
		List<String> intLog = new ArrayList<String>();
		
		// Separate word and int logs
		for (String log : loglines) {
			try {
				// Add integers to intLog
				Integer.parseInt(log.split(" ")[1]);
				intLog.add(log);
			} catch(Exception e) {
				// Add words to wordLog
				// Splits words and ids for sorting
				wordLog.add(new String[] {
					log.substring(log.indexOf(" ") + 1),
					log.split(" ")[0]
				});
			}
		}
		
		// Sort word logs alphabetically, ignoring identifier
		Collections.sort(wordLog, new Comparator<String[]>() {
		    public int compare(String[] a, String[] b) {
				// Ties sorted by identifier
				if (a[0].equals(b[0])) { return a[1].compareTo(b[1]); }
				// Sort list alphabetically
		        return a[0].compareTo(b[0]);
		    }
		});
		
		// Add word logs
		for (String[] log : wordLog) {
			newLog.add(log[1] + " " + log[0]);
		}
		
		// Add integer logs
		for (String log : intLog) {
			newLog.add(log);
		}
		
		// Return the reordered log
		return newLog;
	}
	
	public static void problem1() {
		// Run problem tests
		System.out.println("Test 1:");
		List<String> test1input = new ArrayList<String>(Arrays.asList(
				"a1 9 2 3 1",
				"g1 act car",
				"zo4 4 7",
				"ab1 off key dog",
				"a8 act zoo"
			));
		List<String> test1expected = new ArrayList<String>(Arrays.asList(
				"g1 act car",
				"a8 act zoo",
				"ab1 off key dog",
				"a1 9 2 3 1",
				"zo4 4 7"
			));
		assertProblem1(test1input, test1expected);
		
		
		System.out.println("Test 2:");
		List<String> test2input = new ArrayList<String>(Arrays.asList(
				"zz2 act car",
				"a1 9 2 3 1",
				"g1 act car",
				"a2 act car",
				"zo4 4 7",
				"ab1 off key dog",
				"b7 act car",
				"a8 act zoo"
			));
		List<String> test2expected = new ArrayList<String>(Arrays.asList(
				"a2 act car",
				"b7 act car",
				"g1 act car",
				"zz2 act car",
				"a8 act zoo",
				"ab1 off key dog",
				"a1 9 2 3 1",
				"zo4 4 7"
			));
		assertProblem1(test2input, test2expected);
	}
	
	public static void assertProblem1(List<String> input, List<String> expected) {
		System.out.println("Assessing problem 1:\n");
		
		List<String> output = logSorting(input.size(), input);
		
		System.out.println("Input:"); printLogs(input); System.out.println();
		System.out.println("Output:"); printLogs(output); System.out.println();
		System.out.println("Expected:"); printLogs(expected); System.out.println();
		
		System.out.println("Result:");
		if (output.equals(expected)) { System.out.println("Correct"); }
		else { System.out.println("Incorrect"); }
		
		System.out.println("\n===========================\n");
	}
	
	public static void printLogs(List<String> loglines) {
		for (String s : loglines) {
			System.out.println(s);
		}
	}
}
