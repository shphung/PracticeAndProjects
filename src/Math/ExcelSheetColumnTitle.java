package Math;
/*
 * Leetcode Practice: #171. Excel Sheet Column Number
 * 
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * 
 * For Example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * 
 * Example 1:
 * Input: "A"
 * Output: 1
 * 
 * Example 2:
 * Input: "AB"
 * Output: 28
 * 
 * Example 3:
 * Input: "ZY"
 * Output: 701
 * 
 * Constraints:
 * 	- 1 <= s.length <= 7
 *  - s consists only of uppercase English letters\
 *  - s is between "A" and "FXSHRXW"
 */
public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		System.out.println(titleToNumber("A"));
		System.out.println(titleToNumber("AB"));
		System.out.println(titleToNumber("ZY"));
	}

	public static int titleToNumber(String s) {
		int result = 0;
		for(int e = 0; e < s.length(); e++) {
			result = result * 26 + (s.charAt(e) - 'A' + 1);
		}
		return result;
    }
}
