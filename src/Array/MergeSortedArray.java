package Array;
import java.util.Arrays;

/*
 * Leetcode Practice: #88. Merge Sorted Array
 * 
 * Given two sorted integer arrays nums1 and nums2,
 * merge nums2 into nums1 as one sorted array.
 * 
 * Notes:
 * 	- The number of elements initalized in nums1 and
 * 	  nums2 are m and n respectively.
 *  - You may assume that nums1 has enough space (size
 *    that is greater or equal to m + n) to hold
 *    additional elements from nums2.
 *    
 * Example:
 * 	Input:
 * 		nums1 = [1,2,3,0,0,0], m = 3
 * 		nums2 = [2,5,6], n = 3
 * 	Output:
 * 		[1,2,2,3,5,6]
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		//Test cases
		merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		//Add elements from beginning of nums2 to end of nums1
		for(int i = m, j = 0; i < m + n || j < n; i++, j++) {
			nums1[i] = nums2[j];
		}
		//Sort nums1
		Arrays.sort(nums1);
		//System.out.println(Arrays.toString(nums1));
	}
}
