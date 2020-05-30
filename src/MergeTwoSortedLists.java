/*
 * Leetcode Practice: #21. Merge Two Sorted Lists
 * 
 * Merge two sorted linked lists and return it as a new sorted list.
 * The new list should be made by splicing together the nodes of the
 * first two lists.
 * 
 * Examples:
 * 	Input: 1-> 2-> 4, 1-> 3-> 4
 * 	Output: 1-> 1-> 2-> 3-> 4-> 4
 */
public class MergeTwoSortedLists {

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
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode result = new ListNode();
        ListNode previous = result;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                previous.next = l1;
                l1 = l1.next;
            } else {
                previous.next = l2;
                l2 = l2.next;
            }
            previous = previous.next;
        }
        if(l1 != null) {
            previous.next = l1;
        }
        if(l2 != null) {
            previous.next = l2;
        }
        return result.next;
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}