package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Leetcode Practice: #229. Majority Element II
 * 
 * Given an integer array of size n, find all elements that appear more
 * than ⌊ n/3 ⌋ times.
 * 
 * Note: The algorithm should run in linear time and in O(1) space.
 * 
 * Example 1:
 * 	Input: [3,2,3]
 * 	Output: [3]
 * 
 * Example 2:
 * 	Input: [1,1,1,3,3,2,2,2]
 * 	Output: [1,2]
 */
public class MajorityElementII {
	
	public static void main(String[] args) {
		//Test cases
		System.out.println(majorityElement(new int[] {3,2,3}));
		
		System.out.println(majorityElement(new int[] {1,1,1,3,3,2,2,2}));
		
		System.out.println(majorityElement(new int[] {}));
		
		System.out.println(majorityElement(new int[] {1}));
		
		System.out.println(majorityElement(new int[] {2, 2}));
	}
	
	public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        if(nums == null || nums.length == 0) {
            return ans;
        } else if(nums.length == 1) {
            ans.add(nums[0]);
            return ans;
        } else if(nums.length == 2) {
            set.add(nums[0]);
            ans.add(nums[0]);
            if(!set.contains(nums[1])) {
                ans.add(nums[1]);
            }
            return ans;
        }
        int majority = nums.length / 3;
        for(int i = 0; i < nums.length - 1; i++) {
            int element = nums[i];
            if(set.contains(element)) {
                continue;
            } else {
                set.add(element);
            }
            int amount = 1;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    amount++;
                }
                if(amount > majority) {
                    ans.add(element);
                    break;
                }
            }
        }
        return ans;
    }
}
