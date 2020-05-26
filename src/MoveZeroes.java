import java.util.Arrays;

/*
 * Leetcode Practice: #283. Move Zeroes
 * 
 * Given an array nums, write a function to move
 * all 0's to the end of it while maintaining the
 * relative order of the non-zero elements.
 * 
 * Example:
 * 	Input: [0,1,0,3,12]
 * 	Output: [1,3,12,0,0]
 * 
 * Note:
 * 	1. You must do this in-place without making a copy
 * 	   of the array.
 *  2. Minimize the total number of operations.
 */
public class MoveZeroes {

	public static void main(String[] args) {
		moveZeroes(new int[] {0,1,0,3,12});
		
		moveZeroes(new int[] {9,6,4,2,3,5,7,0,1});
		
		moveZeroes(new int[] {0,9,-2,100,0,0,4,2,3,5,7,0,1,0});
	}

	public static void moveZeroes(int[] nums) {
		//Pointer #1 for nonzero numbers
		int nonZeroIndex = 0;
		
		//Pointer #2 to iterate
		for(int i = 0; i < nums.length; i++) {
			//If element is non-zero value, move to pointer #1 and update #1 pointer
			if(nums[i] != 0) {
				nums[nonZeroIndex++] = nums[i];
			}
		}
		
		//Start where left off and add 0's
		for(int i = nonZeroIndex; i < nums.length; i++) {
			nums[i] = 0;
		}
		
		//System.out.println(Arrays.toString(nums));
	}
}
