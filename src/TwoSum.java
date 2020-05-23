import java.util.Arrays;

/*
 * Leetcode Practice: #1. Two Sum
 * 
 * Given an array of integers, return indices of the two numbers
 * such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * Example:
 * 		Given nums = [2, 7, 11, 15], target = 9,
 * 
 * 		Because nums[0] + nums[1] = 2 + 7 = 9,
 * 		return [0, 1].
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		//Test cases
		int[] solution = twoSum(new int[] {2, 7, 11, 15}, 9);
		System.out.println(Arrays.toString(solution));
		
		solution = twoSum(new int[] {14, 9, 10, 7, 4, 16, 6, 20}, 10);
		System.out.println(Arrays.toString(solution));
		
		try {
			solution = twoSum(new int[] {14, 9, 10, 7, 4, 16, 6, 20}, 555);
		} catch(Exception e) {
			System.out.println("No solution.");
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				//Return indices if they add up to target
				if(nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		//If execution reaches this point, there is no solution
		throw new IllegalArgumentException("No Solution.");
	}
}
