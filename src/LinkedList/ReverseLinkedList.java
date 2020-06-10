package LinkedList;
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


	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode(4);
		list1.next.next.next.next = new ListNode(5);
		list1.next.next.next.next.next = new ListNode();
		System.out.println("List: " + ListNode.toString(list1));
		reverseList(list1);
		System.out.println("Reversed List: " + ListNode.toString(list1));
		
		ListNode list2 = new ListNode(9);
		list2.next = new ListNode(8);
		list2.next.next = new ListNode(7);
		list2.next.next.next = new ListNode(6);
		list2.next.next.next.next = new ListNode(5);
		list2.next.next.next.next.next = new ListNode();
		System.out.println("List: " + ListNode.toString(list2));
		reverseList(list2);
		System.out.println("Reversed List: " + ListNode.toString(list2));
	}

	public static ListNode reverseList(ListNode head) {
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
