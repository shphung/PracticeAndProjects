package Heap;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Leetcode Practice: #703. Kth Largest Element in a Stream
 * 
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in
 * the sorted order, not the kth distinct element.
 * 
 * Your KthLargest class will have a constructor which accepts an integer k and an integer array
 * nums, which contains initial elements from the stream. For each call to the method
 * KthLargest.add, return the element representing the kth largest element in the stream.
 * 
 * Example:
 * 	int k = 3;
 *  int[] arr = [4,5,8,2];
 *  KthLargest kthLargest = new KthLargest(3, arr);
 *  kthLargest.add(3);   // returns 4
 *  kthLargest.add(5);   // returns 5
 *  kthLargest.add(10);  // returns 5
 *  kthLargest.add(9);   // returns 8
 *  kthLargest.add(4);   // returns 8
 * 
 * Note:
 * - You may assume that nums' length >= k-1 and k >= 1.
 */
public class KthLargestElementInAStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private Queue<Integer> pq;
    private int k;
    
    public KthLargestElementInAStream(int k, int[] nums) {
        pq = new PriorityQueue<>(k + 1);
        this.k = k;
        for(int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size() == k + 1) {
            pq.remove();
        }
        return pq.peek();
    }
}
