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
		
		int[] n1 = getNodes(l1);
		int[] n2 = getNodes(l2);
		boolean carry = false;
		
		for (int i=0; i<n1.length; i++) {
			int v = n1[i] + n2[i];
			
			if (carry) { v++; carry = false; }
			if (v >= 10) { v = v-10; carry = true; }
			
			sum.val = v;
			if (i<n1.length-1) {
				sum.next = new ListNode(n1[i+1] + n2[i+1]);
				sum = sum.next;
			}
		}
		
		if (carry)
			sum.next = new ListNode(1);
		
		return sumHead;
	}
	
	public static int[] getNodes(ListNode node) {
		String[] s = node.toString().split(" ");
		int[] nodes = new int[s.length];
		
		for (int i=0; i<s.length; i++) {
			nodes[i] = Integer.parseInt(s[i]);
		}
		
		return nodes;
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
