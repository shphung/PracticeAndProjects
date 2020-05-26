import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Leetcode Practice: #15. 3Sum
 * 
 * Given an array nums of n integers, are there elements a, b, c in nums
 * such that a + b + c = 0? Find all unique triplets in the array which
 * gives the sum of zero.
 * 
 * Note:
 * 		- The solution set must not contain duplicate triplets.
 *
 * Example 1:
 * 	Given array nums = [-1, 0, 1, 2, -1, -4],
 * A Solution set is:
 * [
 * 	[-1, 0, 1],
 * 	[-1, -1, 2]
 * ]
 */
public class ThreeSum {
	public static void main(String[] args) {
		List<List<Integer>> solution = threeSum(new int[] {-1, 0, 1, 2, -1, -4});
		System.out.println(Arrays.toString(solution.toArray()));
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> solutionSet = new HashSet<>();
		Arrays.sort(nums);
		//Three points: i, j, k
		for(int i = 0; i < nums.length - 2; i++) {
			//j start from beginning
			int j = i + 1;
			//k start from end
			int k = nums.length - 1;
			
			while(j < k) {
				//Sum
				int sum = nums[i] + nums[j] + nums[k];
				if(sum == 0) {
					solutionSet.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
				//sum > 0: need smaller values, so decrement k pointer
				} else if(sum > 0) {
					k--;
				//sum < 0: need larger values, so increment j pointer
				} else if(sum < 0) {
					j++;
				}
			}
		}
        return new ArrayList<>(solutionSet);
	}
}
