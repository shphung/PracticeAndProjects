import java.util.Arrays;

/*
 * Leetcode Practice: #34. Find First and Last Position of Element in Sorted Array
 * 
 * Given an array of integers nums sorted in ascending order, find the starting
 * and ending position of a given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * Example 1:
 * 	Input: nums = [5,7,7,8,8,10], target = 8
 * 	Output: [3,4]
 * 
 * Example 2:
 * 	Input: nums = [5,7,7,8,8,10], target = 6
 * 	Output: [-1,-1]
 */
public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(searchRange(new int[] {5,7,7,8,8,10}, 8)));
		
		System.out.println(Arrays.toString(searchRange(new int[] {5,7,7,8,8,10}, 6)));
		
		System.out.println(Arrays.toString(searchRange(new int[] {1}, 1)));
	}
	
	public static int[] searchRange(int[] nums, int target) {
		int[] targetRange = {-1, -1};
		//Find left index
		int leftIndex = insertionIndex(nums, target, true);
		//If there is only 1 element, or element does not match target
		//Return -1,-1
		if(leftIndex == nums.length || nums[leftIndex] != target) {
			return targetRange;
		}
		//Set left index
		targetRange[0] = leftIndex;
		//Get right index
		targetRange[1] = insertionIndex(nums, target, false) - 1;
		
		return targetRange;
	}
	
	private static int insertionIndex(int[] nums, int target, boolean left) {
		int low = 0;
		int high = nums.length;
		//Binary search
		while(low < high) {
			int mid = (high + low) / 2;
			//If mid is > target, move left
			//Else move right
			if(nums[mid] > target || (left && target == nums[mid])) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}
}