package Array;
/*
 * Leetcode Practice: #33. Search in Rotated Sorted Array
 * 
 * Suppose an array sorted in ascending order is rotated at some
 * pivot unknown to you beforehand.
 * 
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * 
 * You are given a target value to search. If found in the array
 * return its index, otherwise return -1.
 * 
 * You may assume no duplicates exist in the array.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n)
 * 
 * Example 1:
 * 	Input: nums = [4,5,6,7,0,1,2], target = 0
 * 	Output: 4
 * 
 * Example 2:
 * 	Input: nums = [4,5,6,7,0,1,2], target = 3
 * 	Output: -1
 */
public class SearchInRotatedArray {

	public static void main(String[] args) {
		System.out.println(search(new int[] {4,5,6,7,0,1,2}, 0));
		
		System.out.println(search(new int[] {4,5,6,7,0,1,2}, 3));
	}

	public static int search(int nums[], int target) {
		//Exit if null or empty
		if(nums == null || nums.length == 0) {
			return -1;
		}
		//Beginning / end index values
		int low = 0, high = nums.length - 1;
		
		//Binary search
		while(low <= high) {
			int mid = (high + low) / 2;
			//If found, return index
			if(target == nums[mid]) {
				return mid;
			}
			//If low value is smaller than mid value (low - mid) is ascending
			if(nums[low] <= nums[mid]) {
				//If target is between low value and mid value
				if(nums[low] <= target && target < nums[mid]) {
					//Decrease high value to go to the left
					high = mid - 1;
					//Else increase low value to go right
				} else {
					low = mid + 1;
				}
			} else {
				//If target is between mid value and high value
				if(nums[mid] < target && target <= nums[high]) {
					//Increase low to go right
					low = mid + 1;
				} else {
					//Decrease high to go left
					high = mid - 1;
				}
			}
		}
		
		return -1;
		
		//O(n) solution
//		for(int i = 0; i < nums.length; i++) {
//			if(nums[i] == target) {
//				return i;
//			}
//		}
//		return -1;
	}
}
