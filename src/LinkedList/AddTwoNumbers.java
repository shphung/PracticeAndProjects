package LinkedList;

/*
 * Leetcode Practice: #2. Add Two Numbers
 * 
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reversed order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example:
 * 	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 	Output: 7 -> 0 -> 8
 * 	Explanation: 342 + 465 = 807
 */
public class AddTwoNumbers {
	
	public static void main(String[] args) {
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode();
		
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next.next = new ListNode(4);
		list2.next.next.next = new ListNode();
		
		System.out.println("List 1: " + ListNode.toString(list1));
		System.out.println("List 2: " + ListNode.toString(list2));
		
		ListNode list3 = addTwoNumbers(list1, list2);
		
		System.out.println("List 3: " + ListNode.toString(list3));
	}
	
	/**
	 * Add two numbers as if on a piece of paper, keep track of sum and carry,
	 * at each iteration, add sum % 10 to LinkedList. At the end, if there is
	 * overflow / carry, add carry to list. Return completed list
	 */
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//Initialize current node as list3 (list to be returned),
		//p and q to head of l1 and l2 respectively
		ListNode l3 = new ListNode(0);
		ListNode p = l1, q = l2, current = l3;
		//Initialize carry to 0
		int carry = 0;
		
		//Loop through lists l1 and l2 until end is reached
		while(p != null || q != null) {
			//If p or q is valid, x / y is p's / q's value respectively
			//else if at the end of the list, set to 0
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			//Sum is x + y + carry
			int sum = carry + x + y;
			//Carry = sum / 10
			carry = sum / 10;
			//Add sum % 10 to list
			current.next = new ListNode(sum % 10);
			//Set current head to next in list
			current = current.next;
			//Advance p / q if possible
			if(p != null) p = p.next;
			if(q != null) q = q.next;
		}
		
		//Add final overflow carry to list
		if(carry > 0) {
			current.next = new ListNode(carry);
		}
		
		//Return list
		return l3.next;
	}
	
	
}