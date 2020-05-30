import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Leetcode Practice: #242. Valid Anagram
 * 
 * Given two strings s and t, write a function to determine if t
 * is an anagram of s.
 * 
 * Example 1:
 * 	Input: s = "anagram", t = "nagaram"
 * 	Output: true
 * 
 * Example 2:
 * 	Input: s = "rat", t = "car"
 * 	Output: true
 */
public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));
		System.out.println(isAnagram("rat", "car"));
	}

	public static boolean isAnagram(String s, String t) {
//		if(s.length() != t.length()) {
//			return false;
//		}
//		
//		char[] str1 = s.toCharArray();
//		char[] str2 = t.toCharArray();
//		Arrays.sort(str1);
//		Arrays.sort(str2);
//		return Arrays.equals(str1, str2);
		
		if(s.length() != t.length()) {
			return false;
		} else {
			List<Character> firstWord = new ArrayList<Character>();
			char[] secondWord = t.toCharArray();
			for(char letter : s.toCharArray()) {
				firstWord.add(letter);
			}
	        for(int i = 0; i < secondWord.length; i++) {
	        	if(firstWord.contains(secondWord[i])) {
	        		firstWord.remove(new Character(secondWord[i]));
	        	}
	        }
	        if(firstWord.isEmpty()) {
	        	return true;
	        }
		}
        return false;
    }
}
