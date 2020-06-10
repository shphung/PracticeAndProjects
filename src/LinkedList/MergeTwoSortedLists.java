package LinkedList;
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
	
	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);
		System.out.println("List 1: " + ListNode.toString(list1));
		
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);
		System.out.println("List 2: " + ListNode.toString(list2));
		
		ListNode list3 = mergeTwoLists(list1, list2);
		System.out.println("Merged List: " + ListNode.toString(list3));
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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