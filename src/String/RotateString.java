package String;
/*
 * Leetcode Practice: #796. Rotate String
 * 
 * We are given two strings, A and B.
 *
 * A shift on A consists of taking string A and moving the leftmost
 * character to the rightmost position. For example, if A = 'abcde', then
 * it will be 'bcdea' after one shift on A. Return True if and only if A
 * can become B after some number of shifts on A.
 * 
 * Example 1:
 * 	Input: A = 'abcde', B = 'cdeab'
 *  Output: true
 *  
 * Example 2:
 *  Input: A = 'abcde', B = 'abced'
 *  Output: false
 *  
 * Note:
 *  - A and B will have length at most 100.
 */
public class RotateString {

	public static void main(String[] args) {
		System.out.println(rotateString("abcde", "cdeab"));
		System.out.println(rotateString("abcde", "abced"));
		System.out.println(rotateString("", ""));
	}

	public static boolean rotateString(String A, String B) {
        if(A.equals("") && B.equals(""))
            return true;
        String s1 = A;
        String s2 = B;
        for(int i = 0; i < A.length(); i++) {
            if(s1.equals(s2))
                return true;
                
            char[] letters = s1.toCharArray();
            String rotateds1 = "";
            for(int j = 1; j < letters.length; j++)
                rotateds1 += Character.toString(letters[j]);
            
            rotateds1 += Character.toString(letters[0]);
            s1 = rotateds1;
        }
        return false;
    }
}
