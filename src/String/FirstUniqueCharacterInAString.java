package String;
import java.util.HashSet;
import java.util.Set;

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
		//All 1 character strings are unique.
        if(s.length() == 1) {
            return 0;
        }
        
        Set<Character> set = new HashSet<Character>();
        
        //Add all repeating characters to a set.
        for(int i = 0; i < s.length() - 1; i++) {
        	//Skip to next i if already found
            if(set.contains(s.charAt(i))) {
                continue;
            }
            for(int j = i + 1; j < s.length(); j++) {
            	//Skip to next j if already found
                if(set.contains(s.charAt(j))) {
                    continue;
                }
                if(s.charAt(i) == s.charAt(j)) {
                    set.add(s.charAt(i));
                    continue;
                }
            }
        }
        
        //All repeating characters are in set.
        //If character is not in set, it is a non-repeating character.
        //Return first non-repeating character.
        for(int i = 0; i < s.length(); i++) {
            if(!set.contains(s.charAt(i))) {
                return i;
            }
        }
        
        //Return -1 if all characters repeat at least once.
        return -1;
    }
}
