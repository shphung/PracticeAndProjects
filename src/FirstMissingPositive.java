/*
 * Leetcode Practice: #41. First Missing Positive
 * 
 * Given an unsorted integer array, find the smallest missing positive integer.
 * 
 * Example 1:
 * 	Input: [1,2,0]
 * 	Output: 3
 * 
 * Example 2:
 * 	Input: [3,4,-1,1]
 * 	Output: 2
 * 
 * Example 3:
 * 	Input: [7,8,9,11,12]
 * 	Output: 1
 * 
 * Note: Your algorithm should run in O(n) time and uses constant extra space.
 */
public class FirstMissingPositive {

	public static void main(String[] args) {
		System.out.println(firstMissingPositive(new int[] {1,2,0}));
		System.out.println(firstMissingPositive(new int[] {3,4,-1,1}));
		System.out.println(firstMissingPositive(new int[] {7,8,9,11,12}));
	}

	public static int firstMissingPositive(int[] nums) {				
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] <= 0 || nums[i] > nums.length) {
				nums[i] = nums.length + 1;
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			int num = Math.abs(nums[i]);
			if(num > nums.length) {
				continue;
			}
			num--;
			if(nums[num] > 0) {
				nums[num] = -1 * nums[num];
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] >= 0) {
				return i + 1;
			}
		}
		
		return nums.length + 1;
	}
}
