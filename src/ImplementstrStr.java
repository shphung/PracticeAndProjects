/*
 * Leetcode Practice: #28. Implement strStr()
 * 
 * Implement strStr().
 * 
 * Return the index of the first occurence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * 
 * Example 1:
 * 	Input: haystack = "hello", needle = "ll"
 * 	Output: 2
 * 
 * Example 2:
 * 	Input: haystack = "aaaaa", needle = "bba"
 * 	Output: -1
 * 
 * Clarification:
 * What should we return when needle is an empty string?
 * This is a great question to ask during an interview.
 * 
 * For the purpose of this problem, we will return 0 when needle
 * is an empty string. This is consistent to C's strstr() and
 * Java's indexOf().
 */
public class ImplementstrStr {

	public static void main(String[] args) {
		System.out.println(strStr("hello", "ll"));

		System.out.println(strStr("aaaaa", "bba"));

		System.out.println(strStr("a", "a"));
	}

	public static int strStr(String haystack, String needle) {
		if(needle.length() == 0) {
			return 0;
		}
		for(int i = 0; i <= haystack.length() - needle.length(); i++) {
			//Get substring of needle length from haystack[0] - haystack[n]
			String s = haystack.substring(i, i + needle.length());
			//If substring matches needle, return i
			if(s.equals(needle)) {
				return i;
			}
		}
		return -1;
	}
}
