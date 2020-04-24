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
	 * Pretty simple, we set a while loop to keep increasing the population
	 * annually with the parameters given until the targer is reached and we
	 * return the number of times we ran the loop.
	 * 
	 * The main things to pay attention to is making sure the formula is set
	 * correctly based on the prompt and the percentage treatment. The percent
	 * actually needs to be converted to the percent after input. So 2 needs
	 * to be turned into 0.02, which you do by just dividing it by 100.
	 * 
	 * There is a problem with it though where if the population doesn't grow
	 * then you end up in an infinite loop. So I've added a quick check to
	 * prevent that.
	 * 
	 * Time complexity: O(1)
	 ************************************************************************/
	
	public static int populationGrowth(int p0, double percent, int aug, int p) {
		int n = 0;
		int p1 = 0;
		
		System.out.println("Initial: " + p0);
		System.out.println("Target:  " + p);
		System.out.println();
		
		// Increase population until target
		while (p0 < p) {
			// Population increase calculation
			p1 = (int) (p0 + (p0 * (percent/100)) + aug);
			// Check for decrease
			if (p0 > p1) { return -1; }
			p0 = p1; // Apply increase
			n++; // Increment year count
			//System.out.println("Growth " + n + ": " + p0);
		}
		
		//System.out.println();
		
        return n;
    }
	
	// Run problem tests
	public static void main(String[] args) {
		problemTests();
	}
	
	public static void problemTests() {
		System.out.println("Running Tests:");
		System.out.println("===========================\n");
		test(populationGrowth(1000, 2, 50, 1200), 3);
		test(populationGrowth(1500, 5, 100, 5000),15);
		test(populationGrowth(1500000, 2.5, 10000, 2000000), 10);
		test(populationGrowth(1500000, 0.25, 1000, 2000000), 94);
		test(populationGrowth(100, 0.25, -5, 2000000), -1);
	}
	
	public static void test(int result, int expect) {
		if (result == expect) { System.out.println("Correct"); }
		else { System.out.println("Incorrect"); }
		System.out.println("Output: " + result);
		System.out.println("Expect: " + expect);
		System.out.println("\n===========================\n");
	}
}
