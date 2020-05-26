/*
 * Leetcode Practice: #81. Search in Rotated Sorted Array II
 * 
 * Suppose an array sorted in ascending order is rotated at some
 * pivot unknown to you beforehand.
 * 
 * (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).
 * 
 * You are given a target value to search. If found in the array
 * return its true, otherwise return false.
 * 
 * Example 1:
 * 	Input: nums = [2,5,6,0,0,1,2], target = 0
 * 	Output: true
 * 
 * Example 2:
 * 	Input: nums = [2,5,6,0,0,1,2], target = 3
 * 	Output: false
 */
public class SearchInRotatedArrayII {

	public static void main(String[] args) {
		System.out.println(search(new int[] {4,5,6,7,0,1,2}, 0));
		
		System.out.println(search(new int[] {4,5,6,7,0,1,2}, 3));
	}

	public static boolean search(int nums[], int target) {
		//Exit if null or empty
		if(nums == null || nums.length == 0) {
			return false;
		}
		//Beginning / end index values
		int low = 0, high = nums.length - 1;

		//Binary search
	    while(low <= high) {
	    	//low + ((high - low) / 2) == (high + low) / 2
	        int mid = low + (high - low) / 2;

			//If found, return true
	        if(nums[mid] == target)
	        	return true;
	        
	        //If mid value is the same as high value, move pointer left
	        if(nums[mid] == nums[high]) {
	        	high--;
	        //If mid value is less than high value
	    	} else if(nums[mid] < nums[high]) {
	    		//If target is between mid and high value
	            if(target > nums[mid] && target <= nums[high])
	            	//Move right
	                low = mid + 1;
	            else
	            	//move left
	                high = mid - 1;
	        } else {
	        	//If target is between low value and mid value
	            if(target >= nums[low] && target < nums[mid])
	            	//Move left
	                high = mid - 1;
	            else
	            	//Move right
	                low = mid + 1;
	        }
	    }
	    return false;
		
		//O(n) Solution
//		for(int i = 0; i < nums.length; i++) {
//			if(nums[i] == target) {
//				return true;
//			}
//		}
//		return false;
	}
}
