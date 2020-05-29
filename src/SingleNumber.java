import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Leetcode Practice: #136. Single Number
 * 
 * Given a non-empty array of integers, every element appears twice
 * except for one. Find that single one.
 * 
 * Note:
 * 	Your algorithm should have a linear runtime complexity.
 * 	Could you implement it without using extra memory?
 * 
 * Example 1:
 * 	Input = [2,2,1]
 *	Output: 1
 *	
 * Example 1:
 * 	Input = [4,1,2,1,2]
 *	Output: 4
 */
public class SingleNumber {

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {2,2,1}));
		
		System.out.println(singleNumber(new int[] {4,1,2,1,2}));
	}
	
	@SuppressWarnings("deprecation")
	public static int singleNumber(int[] nums) {
//		HashMap<Integer, Integer> hashTable = new HashMap<>();
//		for(int i : nums) {
//			hashTable.put(i,  hashTable.getOrDefault(i, 0) + 1);
//		}
//		for(int i : nums) {
//			if(hashTable.get(i) == 1) {
//				return i;
//			}
//		}
//		return 0;
		
		List<Integer> list = new ArrayList<>();
		for(int num : nums) {
			if(!list.contains(num)) {
				list.add(num);
			} else {
				list.remove(new Integer(num));
			}
		}
		return list.get(0);
	}
}
