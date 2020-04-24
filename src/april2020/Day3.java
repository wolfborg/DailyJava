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
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode sum = makeNode(new int[] { 1, 2, 3 });
		
		return sum;
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
	
	public static void problemTests() {
		ListNode l1 = makeNode(new int[] { 2,4,3 });
		ListNode l2 = makeNode(new int[] { 5,6,4 });
		ListNode ex = makeNode(new int[] { 7,0,8 });
		test(addTwoNumbers(l1, l2), ex);
	}
	
	// Run problem tests
	public static void main(String[] args) {
		System.out.println("Running Tests:");
		System.out.println("===========================\n");
		problemTests();
	}
		
	public static void test(ListNode result, ListNode expect) {
		if (result.equals(expect)) { System.out.println("Correct"); }
		else { System.out.println("Incorrect"); }
		System.out.println("Output: " + result);
		System.out.println("Expect: " + expect);
		System.out.println("\n===========================\n");
	}
}
