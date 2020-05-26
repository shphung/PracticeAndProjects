import java.util.Arrays;

/*
 * Leetcode Practice: #268. Missing Number
 * 
 * Given an array containing n distinct numbers
 * taken from 0,1,2,...,n, find the one that is
 * missing from the array.
 * 
 * Example 1:
 * 	Input: [3,0,1]
 * 	Output: 2
 * 
 * Example 2:
 * 	Input: [9,6,4,2,3,5,7,0,1]
 * 	Output: 8
 * 
 * Note:
 * 	Your algorithm should run in linear time complexity.
 *  Could you implement it using only constant extra space
 *  complexity?
 */
public class MissingNumber {

	public static void main(String[] args) {
		int sol = missingNumber(new int[] {3,0,1});
		System.out.println(sol);
		
		sol = missingNumber(new int[] {9,6,4,2,3,5,7,0,1});
		System.out.println(sol);
	}

	public static int missingNumber(int[] nums) {
		int missing = 0;
		//Sort array
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			//If i's value does not match nums[i], i is the missing value
			if(i != nums[i]) {
				missing = i;
				break;
			}
			missing = i+1;
		}
		return missing;
	}
}
