package String;

import java.util.Stack;
/*
 * Leetcode Practice: #917. Reverse Only Letters
 * 
 * Given a string S, return the "reversed" string where all characters that
 * are not a letter stay in the same place, and all letters reverse their
 * positions.
 *
 * Example 1:
 * Input: "ab-cd"
 * Output: "dc-ba"
 * 
 * Example 2:
 * Input: "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 * 
 * Example 3:
 * Input: "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 * 
 * Notes:
 *  - S.length <= 100
 *  - 33 <= S[i].ASCIIcode <= 122
 *  - S doesn't contain \ or "
 */
public class ReverseOnlyLetters {

	public static void main(String[] args) {
		System.out.println(reverseOnlyLetters("ab-cd"));
		System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
		System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
	}

	public static String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack<Character>();
        for(char c : S.toCharArray()) {
        	if(Character.isLetter(c)) {
        		letters.push(c);
        	}
        }
        
        StringBuilder reversed = new StringBuilder();
        for(char c : S.toCharArray()) {
        	if(Character.isLetter(c)) {
        		reversed.append(letters.pop());
        	} else {
        		reversed.append(c);
        	}
        }
        
        return reversed.toString();
    }
}
