package HashTable;

import java.util.HashMap;
import java.util.Map;

/*
 * Leetcode Practice: #290. Word Pattern
 * 
 * Given a pattern and a string str, find if str follows the same pattern.
 * 
 * Here follow means a full match, such that there is a bijection between a
 * letter in pattern and a non-empty word in str.
 * 
 * Example 1:
 * 	Input: pattern = "abba", str = "dog cat cat dog"
 * 	Output: true
 * 
 * Example 2:
 * 	Input: pattern = "abba", str = "dog cat cat fish"
 * 	Output: false
 * 
 * Example 3:
 * 	Input: pattern = "aaaa", str = "dog cat cat dog"
 * 	Output: false
 * 
 * Example 4:
 * 	Input: pattern = "abba", str = "dog dog dog dog"
 * 	Output: false
 * 
 * Note:
 * 	- You may assume pattern contains only lowercase letters, and str contains lowercase letters
 *    that may be separated by a single space.
 */
public class WordPattern {

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));
		System.out.println(wordPattern("abba", "dog cat cat fish"));
		System.out.println(wordPattern("abba", "dog cat cat dog"));
		System.out.println(wordPattern("abba", "dog dog dog dog"));
	}

	public static boolean wordPattern(String pattern, String str) {
        String[] sequence = str.split(" ");
        if(pattern.length() != sequence.length) {
            return false;
        }
        Map index = new HashMap();
        for(Integer i = 0; i < sequence.length; ++i) {
            if(index.put(pattern.charAt(i), i) != index.put(sequence[i], i)) {
                return false;
            }
        }
        return true;
    }
}
