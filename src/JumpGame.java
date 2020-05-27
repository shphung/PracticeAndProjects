/*
 * Leetcode Practice: #55. Jump Game
 * 
 * Given an array of non-negative integers, you are initially
 * positioned at the first index of the array.
 * 
 * Each element in the array represents your maximum jump length
 * at that position.
 * 
 * Determine if you are able to reach the last index.
 * 
 * Example 1:
 * 	Input: nums = [2,3,1,1,4]
 * 	Output: true
 * 	Explanation: Jump 1 step from index 0 to 1, then 3 steps to
 * 	the last index.
 * 
 * Example 2:
 * 	Input: nums = [3,2,1,0,4]
 * 	Output: false
 * 	Explanation: You will always arrive at index 3 no matter what.
 * 	Its maximum jump length is 0, which makes it impossible to reach
 * 	the last index.
 */
public class JumpGame {

	public static void main(String[] args) {
		boolean sol = canJump(new int[] {2,3,1,1,4});
		System.out.println(sol);
		
		sol = canJump(new int[] {3,2,1,0,4});
		System.out.println(sol);
	}
	
	public static boolean canJump(int[] nums) {
		int reachable = 0;
		for(int i = 0; i < nums.length; ++i) {
			if(i > reachable) {
				return false;
			}
			reachable = Math.max(reachable, i + nums[i]);
		}
		return true;
	}
}
