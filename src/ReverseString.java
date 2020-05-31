import java.util.Arrays;

/*
 * Leetcode Practice: #344. Reverse String
 * 
 * Write a function that reverses a string. The input string is
 * given as an array of characters char[].
 * 
 * Do not allocate extra space for another array, you must do this
 * by modifying the input array in-place with O(1) extra memory.
 * 
 * You may assume all the characters consist of printable ASCII
 * characters.
 * 
 * Example 1:
 * 	Input: ["h", "e", "l", "l", "o"]
 * 	Output: ["o", "l", "l", "e", "h"]
 * 
 * Example 2:
 * 	Input: ["H", "a", "n", "n", "a", "h"]
 * 	Output: ["h", "a", "n", "n", "a", "H"]
 */
public class ReverseString {

	public static void main(String[] args) {
		char[] word = new char[] {'h', 'e', 'l', 'l', 'o'};
		reverseString(word);
		System.out.println(Arrays.toString(word));
		
		word = new char[] {'H', 'a', 'n', 'n', 'a', 'h'};
		reverseString(word);
		System.out.println(Arrays.toString(word));
	}

	public static void reverseString(char[] s) {
		for(int i = 0, j = s.length - 1; i < j; i++, j--) {
			char tempChar = s[j];
			s[j] = s[i];
			s[i] = tempChar;
		}
	}
}
