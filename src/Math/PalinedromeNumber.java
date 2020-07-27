package Math;
/*
 * Leetcode Practice: #9. Palindrome Number
 * 
 * Determine whether an integer is a palindrome. An integer is
 * a palindrome when it reads the same backward as forward.
 * 
 * Example 1:
 * 	Input = 121
 *	Output: true
 *
 * Example 2:
 * 	Input = -121
 *	Output: false
 *  Explanation: From left to right, it reads -121. From right
 *  to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Example 1:
 * 	Input = 10
 *	Output: false
 *  Explanation: Reads 01 from right to left. Therefore it is
 *  not a palindrome.
 *  
 *  Follow up:
 *  Coud you solve it without converting the integer to a string?
 */
public class PalinedromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(0));
		System.out.println(isPalindrome(0110));
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(11));
		System.out.println(isPalindrome(1));
	}

	public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int start = 0, end = s.length() - 1;
        while(start < end) {
        	if(s.charAt(start++) - '0' != s.charAt(end--) - '0')
        		return false;
        }
        return true;
    }
}
