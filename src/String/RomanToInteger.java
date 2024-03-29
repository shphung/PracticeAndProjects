package String;
/*
 * Leetcode Practice: #13. Roman to Integer
 * 
 * Roman numerals are represented by seven different symbols:
 * I, V, X, L, C, D, and M.
 * 
 * Symbol:		Value:
 * I			1
 * V			5
 * X			10
 * L			50
 * C			100
 * D			500
 * M			1000
 * 
 * For example, two is written as II in Roman numeral, just two
 * one's added together. Twelve is written as XII, which is simply
 * X + II. The number twenty seven is written as XXVII which is
 * XX + V + II.
 * 
 * Roman numerals are usually written largest to smallest from
 * left to right. However, the roman numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is
 * before the five, we subtract it making four. The same principle
 * applies to the number nine, which is written as IX. There are
 * six instances where subtraction is used.
 * 
 * - I can be placed before V (5) and X (10) to make 4 and 9.
 * - X can be placed before L (50) and C (100) to make 40 and 90.
 * -  
 * 
 * Given a roman numeral, convert it to an integer. Input is guaranteed
 * to be within range from 1 to 3999.
 * 
 * Example 1:
 * 	Input: "III"
 * 	Output: 3
 * 
 * Example 2:
 * 	Input: "IV"
 * 	Output: 4
 * 
 * Example 3:
 * 	Input: "IX"
 * 	Output: 9
 * 
 * Example 4:
 * 	Input: "LVIII"
 * 	Output: 58
 * 	Explanation: L = 50, V = 5, III = 3.
 * 
 * Example 5:
 * 	Input: "MCMXCIV"
 * 	Output: 1994
 * 	Explanation: M = 1000, CM = 900, XC = 90, and IV = 4.
 * 
 */
public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
		
		System.out.println(romanToInt("IV"));
		
		System.out.println(romanToInt("IX"));
		
		System.out.println(romanToInt("XL"));
		
		System.out.println(romanToInt("XC"));
		
		System.out.println(romanToInt("LVIII"));
		
		System.out.println(romanToInt("CD"));
		
		System.out.println(romanToInt("CM"));
		
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	public static int romanToInt(String s) {
		int num = 0;
		char[] letters = s.toCharArray();
		for(int i = 0; i < letters.length; i++) {
			if(String.valueOf(letters[i]).equals("I")) {
				num++;
			} else if(String.valueOf(letters[i]).equals("V")) {
				num += 5;
				if(i != 0 && String.valueOf(letters[i - 1]).equals("I")) {
					num -= 2;
				}
			} else if(String.valueOf(letters[i]).equals("X")) {
				num += 10;
				if(i != 0 && String.valueOf(letters[i - 1]).equals("I")) {
					num -= 2;
				}
			} else if(String.valueOf(letters[i]).equals("L")) {
				num += 50;
				if(i != 0 && String.valueOf(letters[i - 1]).equals("X")) {
					num -= 20;
				}
			} else if(String.valueOf(letters[i]).equals("C")) {
				num += 100;
				if(i != 0 && String.valueOf(letters[i - 1]).equals("X")) {
					num -= 20;
				}
			} else if(String.valueOf(letters[i]).equals("D")) {
				num += 500;
				if(i != 0 && String.valueOf(letters[i - 1]).equals("C")) {
					num -= 200;
				}
			} else if(String.valueOf(letters[i]).equals("M")) {
				num += 1000;
				if(i != 0 && String.valueOf(letters[i - 1]).equals("C")) {
					num -= 200;
				}
			}
		}
		return num;
	}
}
