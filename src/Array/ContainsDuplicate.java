package Array;
import java.util.HashSet;
import java.util.Set;

/*
 * Leetcode Practice: #217. Contains Duplicate
 * 
 * Given an array of integers, find if the array
 * contains any duplicates.
 * 
 * Your function should return true if any value
 * appears at least twice in the array, and should
 * return false if every element is distinct.
 * 
 * Example 1:
 * 	Input: [1,2,3,1]
 * 	Output: true
 * 
 * Example 2:
 * 	Input: [1,2,3,4]
 * 	Output: false
 * 
 * Example 3:
 * 	Input: [1,1,1,3,3,4,3,2,4,2]
 * 	Output: true
 */
public class ContainsDuplicate {

	public static void main(String[] args) {
		boolean sol = containsDuplicate(new int[] {1,2,3,1});
		System.out.println(sol);
		
		sol = containsDuplicate(new int[] {1,2,3,4});
		System.out.println(sol);
		
		sol = containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2});
		System.out.println(sol);
	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>(nums.length);
		//Add element to set, if set contains element already, return true
		for(int x : nums) {
			if(set.contains(x))
				return true;
			set.add(x);
		}
		return false;
	}
}
