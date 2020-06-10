package LinkedList;

/*
 * Leetcode Practice: #237. Delete Node in a Linked List
 * 
 * Write a function to delete a node (except the tail) in a singly
 * linked list, given only access to that node.
 * 
 * Given linked list -- head = [4,5,1,9], which looks like the following:
 * 4-> 5-> 1-> 9
 * 
 * Example 1:
 * 	Input: head = [4,5,1,9], node = 5
 * 	Output: [4,1,9]
 * 	Explanation: You are given the second node with value 5, the linked list
 * 	should become 4 -> 1 -> 9 after calling your function.
 * 
 * Example 2:
 * 	Input: head = [4,5,1,9], node = 1
 * 	Output: [4,5,9]
 * 	Explanation: You are given the third node with value 1, the linked list
 * 	should become 4 -> 5 -> 9 after calling your function.
 */
public class DeleteNodeInALinkedList {
	
	public static void main(String[] args) {
		ListNode list1 = new ListNode(4);
		list1.next = new ListNode(5);
		list1.next.next = new ListNode(1);
		list1.next.next.next = new ListNode(9);
		list1.next.next.next.next = new ListNode();
		System.out.println("List: " + ListNode.toString(list1));
		deleteNode(list1.next);
		System.out.println("List: " + ListNode.toString(list1));
		
		ListNode list2 = new ListNode(4);
		list2.next = new ListNode(5);
		list2.next.next = new ListNode(1);
		list2.next.next.next = new ListNode(9);
		list2.next.next.next.next = new ListNode();
		System.out.println("List: " + ListNode.toString(list2));
		deleteNode(list2.next.next);
		System.out.println("List: " + ListNode.toString(list2));
	}
	
	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
        node.next = node.next.next;
	}
}
