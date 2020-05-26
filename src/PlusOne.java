import java.util.Arrays;

/*
 * Leetcode Practice: #66. Plus One
 * 
 * Given a non-empty array of digits representing a non-negative
 * integer, plus one to the integer.
 * 
 * The digits are stored such that the most significant digit is
 * at the head of the list, and each element in the array contain
 * a single digit.
 * 
 * You may assume the integer does not contain any leading zero,
 * except the number 0 itself.
 * 
 * Example 1:
 * 	Input: [1,2,3]
 * 	Output: [1,2,4]
 * 	Explanation: The array represents the integer 123.
 * 
 * Example 2:
 * 	Input: [4,3,2,1]
 * 	Output: [4,3,2,2]
 * 	Explanation: The array represents the integer 4321.
 */
public class PlusOne {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] {1,2,3})));
		
		System.out.println(Arrays.toString(plusOne(new int[] {4,3,2,1})));
		
		System.out.println(Arrays.toString(plusOne(new int[] {9,8,7,6,5,4,3,2,1,0})));
		
		System.out.println(Arrays.toString(plusOne(new int[] {9,9,9,9,9,9,9})));
	}

	public static int[] plusOne(int[] digits) {
		//Start from end of array and work forwards
		for(int i = digits.length - 1; i >= 0; i--) {
			//If sum results in 9, add and return result
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			//If sum results in 10, set to 0 and move to next element
			digits[i] = 0;
		}
		//For special 9...n amount of times case
		int[] newNumber = new int[digits.length + 1];
		newNumber[0] = 1;
		return newNumber;
	}
}
