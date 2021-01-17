package Array;

import java.util.Arrays;

/*
 * Leetcode Practice: #1480. Running Sum of 1d Array
 * 
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * 
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * 
 * Example 2:
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 * 
 * Example 3:
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 */
public class RunningSumOf1DArray {

	public static void main(String[] args) {
		int[] solution;
		solution = runningSum(new int[]{1, 2, 3, 4});
		System.out.println(Arrays.toString(solution));
		solution = runningSum(new int[]{1, 1, 1, 1, 1});
		System.out.println(Arrays.toString(solution));
		solution = runningSum(new int[]{3, 1, 2, 10, 1});
		System.out.println(Arrays.toString(solution));
		
	}

	public static int[] runningSum(int[] nums) {
		int[] list = new int[nums.length];
		int currentSum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			currentSum += nums[i];
			list[i] = currentSum;
		}
		
		return list;
    }
}
