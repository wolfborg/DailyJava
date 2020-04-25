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
	
	public static void problemTests() {
		ListNode l1, l2, ex = null;
		
		l1 = makeNode(new int[] { 2,4,3 });
		l2 = makeNode(new int[] { 5,6,4 });
		ex = makeNode(new int[] { 7,0,8 });
		test(addTwoNumbers(l1, l2), ex);
		
		l1 = makeNode(new int[] { 4,2,8,9,1 });
		l2 = makeNode(new int[] { 5,6,4,3,4 });
		ex = makeNode(new int[] { 9,8,2,3,6 });
		test(addTwoNumbers(l1, l2), ex);
		
		l1 = makeNode(new int[] { 9,9,9,9,9,9 });
		l2 = makeNode(new int[] { 0,9,9,9,9,9 });
		ex = makeNode(new int[] { 9,8,9,9,9,9,1 });
		test(addTwoNumbers(l1, l2), ex);
		
		l1 = makeNode(new int[] { 0 });
		l2 = makeNode(new int[] { 7,3 });
		ex = makeNode(new int[] { 7,3 });
		test(addTwoNumbers(l1, l2), ex);
		
		l1 = makeNode(new int[] { 0,3 });
		l2 = makeNode(new int[] { 7,3,4,5,6 });
		ex = makeNode(new int[] { 7,6,4,5,6 });
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
