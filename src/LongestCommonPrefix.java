import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode Practice: #14. Longest Common Prefix
 * 
 * Write a function to find the longest common prefix string amongst
 * an array of strings.
 * 
 * If there is no prefix, return an empty string "".
 * 
 * Example 1:
 * 	Input: ["flower", "flow", "flight"]
 * 	Output: "fl"
 * 
 * Example 2:
 * 	Input: ["dog", "racecar", "car"]
 * 	Output: ""
 * 	Explanation: There is no common prefix among the input strings.
 * 
 * Note:
 *  - All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] {"flower", "flow", "flight"}));

		System.out.println(longestCommonPrefix(new String[] {"dog", "racecar", "car"}));
		
		System.out.println(longestCommonPrefix(new String[] {"aca", "cba"}));
		
		System.out.println(longestCommonPrefix(new String[] {"abca", "aba", "aaab"}));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0)
			return "";

		String s = "";
		
		//minLength = smallest string size
		//Since prefix size will be at most size of smallest string, allows to exit early
		int minLength = Integer.MAX_VALUE;
		for(int i = 0; i < strs.length; i++) {
			minLength = Math.min(minLength, strs[i].length());
		}
		
		List<String> list = new ArrayList<String>();
		//Check letter of each word before moving onto next letter
		for(int currentLetter = 0; currentLetter < minLength; currentLetter++) {
			for(int currentWord = 0; currentWord < strs.length; currentWord++) {
				//Get word's current char
				String letter = String.valueOf(strs[currentWord].charAt(currentLetter));
				//In first iteration of word, always add letter
				if(currentWord == 0) {
					list.add(letter);
				//In other iterations, if list does not have the letter or if letter added in word[0]
				//does not appear in any of the other words[i], then remove the letter
				} else if(currentWord != 0 && (!list.contains(letter) || !list.get(list.size() - 1).equals(letter))) {
					list.remove(list.size() - 1);
					break;
				}
			}
			//If the beginning letter does not match exit loop, no need to keep checking
			if(list.isEmpty()) {
				break;
			}
		}
		//Add list's values to final string
		for(int i = 0; i < list.size(); i++) {
			s += list.get(i);
		}
		return s;
	}
}
