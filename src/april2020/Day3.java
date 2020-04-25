package april2020;

/*******************************************************************
 * Problem: Add Two Numbers
 * Date: April 24th, 2020
 * 
 * You are given two non-empty linked lists representing two
 * non-negative integers. The digits are stored in reverse order
 * and each of their nodes contain a single digit. Add the two
 * numbers and return it as a linked list. You may assume the
 * two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * 
 *******************************************************************/

public class Day3 {

	/************************************************************************
	 * Solution:
	 * 
	 * 
	 * 
	 * Time complexity: 
	 ************************************************************************/
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode sumHead = new ListNode(0);
		ListNode sum = sumHead;
		
		boolean carry = false;
		
		while (l1 != null || l2 != null) {
			if (l1 == null) { l1 = new ListNode(0); }
			else if (l2 == null) { l2 = new ListNode(0); }
			
			int v = l1.val + l2.val;
			
			if (carry) { v++; carry = false; }
			if (v >= 10) { v = v-10; carry = true; }
			
			sum.val = v;
			
			if (l1.next != null || l2.next != null) {
				if (l1.next != null) l1 = l1.next;
				if (l2.next != null) l2 = l2.next;
				sum.next = new ListNode(0);
			} else {
				l1 = null; l2 = null;
				
				if (carry)
					sum.next = new ListNode(1);
			}
			
			sum = sum.next;
		}
		
		return sumHead;
	}
	
	public static ListNode makeNode(int[] nodes) {
		ListNode head = null;
		ListNode node = null;
		
		for (int i : nodes) {
			if (head == null) {
				head = new ListNode(i);
				node = head;
				continue;
			}
			node.next = new ListNode(i);
			node = node.next;
		}
		
		return head;
	}
	
	public static boolean additionTest(String in1, String in2, String exp) {
		return test(
			addTwoNumbers(
				makeNode(strToIntArr(in1)),
				makeNode(strToIntArr(in2))),
			makeNode(strToIntArr(exp))
		);
	}
	
	public static int[] strToIntArr(String in) {
		String[] s = in.split(",");
		int[] out = new int[s.length];
		for (int i=0; i<s.length; i++) {
			out[i] = Integer.parseInt(s[i]);
		}
		return out;
	}
	
	public static void problemTests() {
		additionTest(
			"2,4,3",
			"5,6,4",
			"7,0,8"
		);
		
		additionTest(
			"4,2,8,9,1",
			"5,6,4,3,4",
			"9,8,2,3,6"
		);
		
		additionTest(
			"9,9,9,9,9,9",
			"0,9,9,9,9,9",
			"9,8,9,9,9,9,1"
		);
		
		additionTest(
			"0",
			"7,3",
			"7,3"
		);
		
		additionTest(
			"0,3",
			"7,3,4,5,6",
			"7,6,4,5,6"
		);
		
		additionTest(
			"9,8",
			"1",
			"0,9"
		);
	}
	
	// Run problem tests
	public static void main(String[] args) {
		System.out.println("Running Tests:");
		System.out.println("===========================\n");
		problemTests();
	}
		
	public static boolean test(ListNode output, ListNode expect) {
		boolean result = output.equals(expect);
		if (result) { System.out.println("Correct"); }
		else { System.out.println("Incorrect"); }
		System.out.println("Output: " + output);
		System.out.println("Expect: " + expect);
		System.out.println("\n===========================\n");
		return result;
	}
}
