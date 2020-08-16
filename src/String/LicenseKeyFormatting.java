package String;
/*
 * Leetcode Practice: #482. License Key Formatting
 * 
 * You are given a license key represented as a string S which consists only
 * alphanumeric character and dashes.The string is separated into N+1 groups by N dashes.
 * 
 * Given a number K, we would want to reformat the strings such that each group
 * contains exactly K characters, except for the first group which could be shorter
 * than K, but still must contain at least one character. Furthermore, there must
 * be a dash inserted between two groups and all lowercase letters should be converted to uppercase.
 * 
 * Given a non-empty string S and a number K, format the string according to
 * the rules described above.
 * 
 * Example 1:
 * 	Input: S = "5F3Z-2e-9-w", K = 4
 * 	Output: "5F3Z-2E9W"
 * Explanation: The string S has been split into two parts, each part has 4 characters.
 * Note that the two extra dashes are not needed and can be removed.
 * 
 * Example 2:
 * 	Input: S = "2-5g-3-J", K = 2
 * 	Output: "2-5G-3J"
 * Explanation: The string S has been split into three parts, each part has 2 characters
 * except the first part as it could be shorter as mentioned above.
 * 
 * Note:
 * 1. The length of string S will not exceed 12,000, and K is a positive integer.
 * 2. String S consists only of alphanumerical characters (a-z and/or A-Z and/or 0-9) and dashes(-).
 * 3. String S is non-empty.
 */
public class LicenseKeyFormatting {

	public static void main(String[] args) {
		System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));

		System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
	}

	public static String licenseKeyFormatting(String S, int K) {
        StringBuilder string = new StringBuilder();
        //Start from end, keep track of count
        for(int i = S.length() - 1, count = 0; i >= 0; i--) {
            char c = S.charAt(i);
            //Ignore - char in original string
            if(c == '-') 
                continue;
            //If count is max length K, add - to separate groups
            if(count == K) {
                string.append('-');
                count = 0;
            }
            //Add char to string
            string.append(Character.toUpperCase(c));
            count++;
        }
        //Reverse and return
        return string.reverse().toString();
    }
}
