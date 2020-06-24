package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class GroupAnagrams {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}).toArray()));

		System.out.println(Arrays.toString(groupAnagrams(new String[] {"a", "a", "a"}).toArray()));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] found = new boolean[strs.length];
            
        for(int i = 0; i < strs.length - 1; i++) {
            List<String> temp = new ArrayList<>();
            for(int j = i + 1; j < strs.length; j++) {
                if(found[i] && found[j]) {
                    continue;
                }
                if(found[i] && isAnagram(strs[i], strs[j])) {
                    temp.add(strs[j]);
                    found[j] = true;
                } else if(found[j] && isAnagram(strs[i], strs[j])) {
                    temp.add(strs[i]);
                    found[i] = true;
                } else if(isAnagram(strs[i], strs[j])) {
                    temp.add(strs[i]);
                    temp.add(strs[j]);
                    found[i] = true;
                    found[j] = true;
                }
            }
            if(!temp.isEmpty()) {
                ans.add(temp);
            }
        }
                   
        for(int i = 0; i < strs.length; i++) {
            if(!found[i]) {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
    
    @SuppressWarnings("deprecation")
	public static boolean isAnagram(String s, String t) {
    	if(s.equals(t)) {
    		return true;
    	} else if(s.length() != t.length()) {
            return false;
        } else {
            List<Character> word1 = new ArrayList<Character>();
            char[] word2 = t.toCharArray();
            for(char letter : s.toCharArray()) {
                word1.add(letter);
            }
            for(int i = 0; i < word2.length; i++) {
                if(word1.contains(word2[i])) {
                    word1.remove(new Character(word2[i]));
                }
            }
            if(word1.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
