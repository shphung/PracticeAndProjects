import java.util.HashMap;

/*
 * Leetcode Practice: #387. First Unique Character in a String
 * 
 * Given a string, find the first non-repeating character in it and return
 * its index. If it doesn't exist, return -1.
 * 
 * Examples:
 * 	s = "leetcode"
 *  return 0.
 *  
 *  s = loveleetcode"
 *  return 2.
 *  
 *  Note: Assume the string contains only lowercase letters.
 */
public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));

		System.out.println(firstUniqChar("loveleetcode"));

	}

	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		int n = s.length();
		
		for(int i = 0; i < n; i++) {
			char c = s.charAt(i);
			count.put(c, count.getOrDefault(c, 0) + 1);
		}
		
		for(int i = 0; i < n; i++) {
			if(count.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}
