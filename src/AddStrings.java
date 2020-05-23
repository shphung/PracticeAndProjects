/*
 * Leetcode Practice: #415. Add Strings
 * 
 * Given two non-negative integers num1 and num2 represented as string,
 * return the sum of num1 and num2.
 *
 * Note:
 * 1. The length of both num1 and num2 is < 5100.
 * 2. Both num1 and num2 contains only digits 0-9.
 * 3. Both num1 and num2 does not contain any leading 0.
 * 4. You must not use any built-in BigInteger library or
 * 	  convert the inputs to integer directly.
 *
 */
public class AddStrings {
	
	public static void main(String[] args) {
		//Test cases
		System.out.println(addStrings("999", "111"));

		System.out.println(addStrings("123", "123"));
		
		System.out.println(addStrings("721", "4448"));
	}
	
	public static String addStrings(String num1, String num2) {
		//Length of num1 and num2
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        //Carry over when adding
        int carry = 0;
        StringBuffer result = new StringBuffer();
        
        //While there are still chars to read
        while(i >= 0 || j >= 0) {
            int sum = carry;
            
            //Add current char in num1 to sum
            if(i >= 0) {
            	//Current character's ASCII value - 0's ASCII value = 0-9
                sum += num1.charAt(i--) - '0';
            }
            
            //Add current char in num2 to sum
            if(j >= 0) {
            	//Current character's ASCII value - 0's ASCII value = 0-9
                sum += num2.charAt(j--) - '0';
            }
            
            //Modulus gives right hand digit, sum
            result.append(sum % 10);
            //Division gives left hand digit, carry over
            carry = sum / 10;                
        }
        if(carry > 0)
            result.append(carry);
        return result.reverse().toString();
    }
}
