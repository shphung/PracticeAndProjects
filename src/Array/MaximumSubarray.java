package Array;
/*
 * Leetcode Practice: #53. Maximum Subarray
 * 
 * Given an integer array nums, find the contigous subarray
 * (containing at least one number) which has the largest sum
 * and return its sum.
 * 
 * Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4],
 * Output: 6
 * Explanation: [4, -1, 2, 1] has the largest sum = 6
 * 
 */
public class MaximumSubarray {

	public static void main(String[] args) {
		//Test case
		System.out.println(maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
	}

	public static int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		//Return sum of array size 1
		if(nums.length == 1)
			return nums[0];
		
		for(int i = 0; i < nums.length; i++) {
			//If previous sum was negative, replace with current value
			if(sum < 0) {
				sum = nums[i];
			//If sum is positive, add to total sum
			} else {
				sum += nums[i];
			}
			//If replaced or added sum is greater than max, new max sum
			if(sum > max) {
				max = sum;
			}
		}
		return max;
	}
}