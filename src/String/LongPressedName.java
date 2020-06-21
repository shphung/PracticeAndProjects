package String;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode Practice: #925. Long Pressed Name
 * 
 * Your friend is typing his name into a keyboard.  Sometimes, when typing a
 * character c, the key might get long pressed, and the character will be typed 1
 * or more times.
 * 
 * You examine the typed characters of the keyboard.  Return True if it is
 * possible that it was your friends name, with some characters (possibly none)
 * being long pressed.
 *
 * Example 1:
 * Input: name = "alex", typed = "aaleex"
 * Output: true
 * Explanation: 'a' and 'e' in 'alex' were long pressed.
 * 
 * Example 2:
 * Input: name = "saeed", typed = "ssaaedd"
 * Output: false
 * Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
 * 
 * Example 3:
 * Input: name = "leelee", typed = "lleeelee"
 * Output: true
 * 
 * Example 4:
 * Input: name = "laiden", typed = "laiden"
 * Output: true
 * Explanation: It's not necessary to long press any character.
 * 
 * Constraints:
 *  - 1 <= name.length <= 1000
 *  - 1 <= typed.length <= 1000
 *  - The characters of name and typed are lowercase letters.
 */
public class LongPressedName {

	public static void main(String[] args) {
		System.out.println(isLongPressed("alex", "aaleex"));
		System.out.println(isLongPressed("saeed", "ssaaedd"));
		System.out.println(isLongPressed("leelee", "lleeelee"));
		System.out.println(isLongPressed("laiden", "laiden"));
	}

	public static boolean isLongPressed(String name, String typed) {
		Group g1 = groupify(name);
		Group g2 = groupify(typed);
		
		if(!g1.key.equals(g2.key))
			return false;
		
		for(int i = 0; i < g1.count.size(); ++i) {
			if(g1.count.get(i) > g2.count.get(i)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static Group groupify(String s) {
		StringBuilder key = new StringBuilder();
		List<Integer> count = new ArrayList<Integer>();
		int anchor = 0;
		int N = s.length();
		for(int i = 0; i < N; ++i) {
			if(i == N-1 || s.charAt(i) != s.charAt(i+1)) {
				key.append(s.charAt(i));
				count.add(i - anchor + 1);
				anchor = i + 1;
			}
		}
		return new Group(key.toString(), count);
	}
}

class Group {
	String key;
	List<Integer> count;
	Group(String k, List<Integer> c) {
		key = k;
		count = c;
	}
}