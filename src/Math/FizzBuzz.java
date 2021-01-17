package Math;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode Practice: #412. Fizz Buzz
 * 
 * Write a program that outputs the string representation of numbers from 1 to n.
 * 
 * But for multiples of three it should output “Fizz” instead of the number and for
 * the multiples of five output “Buzz”. For numbers which are multiples of both three
 * and five output “FizzBuzz”.
 * 
 * Example:
 * n = 10,
 * Return:
 * [
 * 		"1",
 * 		"2",
 * 		"Fizz",
 * 		"4",
 * 		"Buzz",
 * 		"Fizz",
 * 		"7",
 * 		"8",
 * 		"Fizz",
 * 		"Buzz",
 * 		"11",
 * 		"Fizz",
 * 		"13",
 * 		"14",
 * 		"FizzBuzz"
 * ]
 * 	Input = 10
 *	Output: 4
 *	Explanation: There are 4 prime numbers less than 10, they are:
 *		2, 3, 5, 7.
 */
public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}

	public static List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 1 ; i <= n; i++) {
        	if((i % 3 == 0) && (i % 5 == 0)) {
        		list.add("FizzBuzz");
        	} else if(i % 3 == 0) {
        		list.add("Fizz");
        	} else if(i % 5 == 0) {
        		list.add("Buzz");
        	} else {
        		list.add(String.valueOf(i));
        	}
        }
        return list;
    }
}
