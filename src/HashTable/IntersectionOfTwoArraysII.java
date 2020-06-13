package HashTable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Leetcode Practice: #350. Intersection of Two Arrays II
 * 
 * Given two arrays, write a function to compute their intersection.
 * 
 * Example 1:
 * 	Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * 	Output: [2,2]
 * 
 * Example 2:
 * 	Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 	Output: [4,9]
 * 
 * Note:
 * 	- Each element in the result should appear as many times as it
 * 	  shows in both arrays.
 *  - The result can be in any order.
 *  
 * Follow Up:
 *  - What if the given array is already sorted? How would you optimize
 *    your algorith?
 *  - What if nums1's size is small compared to nums2's size? Which algorithm
 *    is better?
 *  - What if elements of nums2 are stored on disk, and the memory is limited
 *    such that you cannot load all elements into the memory at once?
 */
public class IntersectionOfTwoArraysII {

	public static void main(String[] args) {
		int[] solution = intersect(new int[] {1,2,2,1}, new int[] {2,2});
		System.out.println(Arrays.toString(solution));
		
		solution = intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4});
		System.out.println(Arrays.toString(solution));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		if(nums1.length < nums2.length) {
			int[] temp = nums1;
			nums1 = nums2;
			nums2 = temp;
		}
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> solutionList = new ArrayList<Integer>();
		for(int num : nums1) {
			list.add(num);
		}
		for(int i = 0; i < nums2.length; i++) {
			if(list.contains(nums2[i])) {
				solutionList.add(nums2[i]);
				list.remove(new Integer(nums2[i]));
			}
		}
		int[] solution = new int[solutionList.size()];
		for(int i = 0; i < solutionList.size(); i++) {
			solution[i] = solutionList.get(i);
		}
		return solution;
	}
}
