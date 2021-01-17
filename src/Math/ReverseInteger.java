package Math;

import java.util.Stack;

/*
 * Leetcode Practice: #7. Reverse Integer
 * 
 * Given a 32-bit signed integer, reversed digits of an integer.
 * 
 * Example 1:
 * 	Input: 123
 *  Output: 321
 * 
 * Example 2:
 * 	Input: -123
 *  Output: -321
 *  
 * Example 3:
 * 	Input: 120
 *  Output: 21
 * 
 * Note:
 * - Assume we are dealing with an environment which could only store
 * integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 * For the purpose of this problem, assume that your function returns
 * 0 when the reversed integer overflows.
 */
public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
		System.out.println(reverse(120));
		System.out.println(reverse(1534236469));
	}

	public static int reverse(int x) {
		int reversed = 0;
		
		while(x != 0) {
			int pop = x % 10;
			x /= 10;
			if(reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && pop > 7))
				return 0;
			if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && pop < -8))
				return 0;
			reversed = reversed * 10 + pop;
		}
		
		return reversed;
	}
}
