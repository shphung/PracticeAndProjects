import java.util.Stack;

/*
 * Leetcode Practice: #20. Valid Parentheses
 * 
 * Given a string containing just the characters '(' , ')' ,
 * '{' , '}' , '[' , and ']' , determine if the input string
 * is valid.
 * 
 * An input string is valid if:
 * 	1. Open brackets must be closed by the same type of brackets.
 * 	2. Open brackets must be closed in the correct order.
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 	Input: "()"
 * 	Output: true
 * 
 * Example 2:
 * 	Input: "()[]{}"
 * 	Output: true
 * 
 * Example 3:
 * 	Input: "(]"
 * 	Output: true
 * 
 * Example 4:
 * 	Input: "([)]"
 * 	Output: true
 * 
 * Example 5:
 * 	Input: "{[]}"
 * 	Output: true
 */
public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(isValid("()"));

		System.out.println(isValid("()[]{}"));

		System.out.println(isValid("(]"));

		System.out.println(isValid("([)]"));

		System.out.println(isValid("{[]}"));
		
		System.out.println(isValid("{[{}{}())]}"));
		
		System.out.println(isValid("{[((()))]}"));
		
		System.out.println(isValid("{[{}}]}"));
		
		System.out.println(isValid("){"));
	}

	public static boolean isValid(String s) {
		if(s.length() == 0) {
			return true;
		} else if(s.length() % 2 == 1) {
			return false;
		}
		Stack<Character> operators = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {
			char currentCharacter = s.charAt(i);
			switch(currentCharacter) {
				case '(':
				case '{':
				case '[':
					operators.push(currentCharacter);
					break;
				case ')':
					if(i == 0 || '(' != operators.pop())
						return false;
					break;
				case '}':
					if(i == 0 || '{' != operators.pop())
						return false;
					break;
				case ']':
					if(i == 0 || '[' != operators.pop())
						return false;
					break;
			}
		}
		return operators.isEmpty();
	}
}
