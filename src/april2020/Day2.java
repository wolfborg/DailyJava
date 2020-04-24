package april2020;

/*******************************************************************
 * Problem: Population Growth
 * Date: April 23nd, 2020
 * In a small town the population is p0 = 1000 at the beginning of a year.
 * The population regularly increases by 2 percent per year and moreover
 * 50 new inhabitants per year come to live in the town. How many years
 * does the town need to see its population greater or equal to p = 1200
 * inhabitants?
 * 
 * Input:
 * - Initial population
 * - Percentage annual increase
 * - Additional population change
 * - Target population
 * 
 * Output:
 * - Number of years to reach target
 *******************************************************************/

public class Day2 {
	/************************************************************************
	 * Solution:
	 * 
	 * 
	 * 
	 * Time complexity: 
	 ************************************************************************/
	
	public static int populationGrowth(int p0, double percent, int aug, int p) {
		
		// Solution here
		
        return 0;
    }
	
	// Run problem tests
	public static void main(String[] args) {
		problemTests();
	}
	
	public static void problemTests() {
		System.out.println("Running Tests:");
		System.out.println("===========================\n");
		test(populationGrowth(1000, 0.02, 50, 1200), 3);
		test(populationGrowth(1500, 5, 100, 5000),15);
		test(populationGrowth(1500000, 2.5, 10000, 2000000), 10);
		test(populationGrowth(1500000, 0.25, 1000, 2000000), 94);
	}
	
	public static void test(int result, int expect) {
		if (result == expect) { System.out.println("Correct"); }
		else { System.out.println("Incorrect"); }
		System.out.println("Output: " + result);
		System.out.println("Expect: " + expect);
		System.out.println("\n===========================\n");
	}
}
