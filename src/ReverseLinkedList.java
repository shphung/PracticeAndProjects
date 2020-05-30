/*
 * Leetcode Practice: #206. Reverse Linked List
 * 
 * Reverse a singly linked list.
 * 
 * Given linked list -- head = [4,5,1,9], which looks like the following:
 * 4-> 5-> 1-> 9
 * 
 * Example 1:
 * 	Input: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
 * 	Output: 5 -> 4 -> 3 -> 2 -> 1 -> NULL
 */
public class ReverseLinkedList {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }
}
