package Array;
/*
 * Leetcode Practice: #189. Rotate Array
 * 
 * Given an array, rotate the array to the right
 * by k steps, where k is non-negative.
 * 
 * Follow up:
 * 	- Try to come up with as many soluations as you can,
 *    there are at least 3 different ways to solve this
 *    problem.
 *  - Could you do it in-place with O(1) extra space?
 * 
 * Example 1:
 * 	Input: nums = [1,2,3,4,5,6,7], k = 3
 * 	Output: [5,6,7,1,2,3,4]
 * 	Explanation:
 * 		rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * 		rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * 		rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * Example 2:
 * 	Input: nums[-1,-100,3,99], k = 2
 * 	Output: [3,99,-1,-100]
 * 	Explanation:
 * 		rotate 1 steps to the right: [99,-1,-100,3]
 * 		rotate 2 steps to the right: [3,99,-1,-100]
 * 
 * Contraints:
 * 	- 1 <= nums.length <= 2 * 10^4
 *  - It's guaranteed that nums[i] fits in a 32 bit-signed integer
 *  - k >= 0
 */
public class RotateArray {

	public static void main(String[] args) {
		rotate(new int[] {1,2,3,4,5,6,7}, 3);
		
		rotate(new int[] {-1,-100,3,99}, 2);
	}

	//Solution 1: Brute force swapping
	public static void rotate(int[] nums, int k) {
		for(int numOfRots = 1; numOfRots <= k; numOfRots++) {
			int temp = nums[0];
			nums[0] = nums[nums.length - 1];
			for(int i = 1; i < nums.length; i++) {
				int temp2 = nums[i];
				nums[i] = temp;
				temp = temp2;
			}
		}
		//System.out.println(Arrays.toString(nums));
	}
	
	//Solution 2: Using another array
//	public static void rotate(int[] nums, int k) {
//		for(int numOfRots = 1; numOfRots <= k; numOfRots++) {
//			int[] tempArray = new int[nums.length];
//			tempArray[0] = nums[nums.length - 1];
//			for(int i = 0; i < nums.length - 1; i++) {
//				tempArray[i + 1] = nums[i];
//			}
//			nums = tempArray;
//		}
//	}
}
