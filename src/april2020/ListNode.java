package april2020;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	
	public String toString() {
		String s = "";
		
		ListNode node = this;
		while (node != null) {
			s += node.next + " ";
			node = node.next;
		}
		
		return s;
	}
}
