package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Leetcode Practice: #46. Permutations
 * 
 * Given a collection of distinct integers, return all possible permutations.
 *
 * Example 1:
 * Input: [1,2,3]
 * Output:
 * [
 *  [1,2,3],
 *  [1,3,2],
 *  [2,1,3],
 *  [2,3,1],
 *  [3,1,2],
 *  [3,2,1]
 * ]
 */
public class Permutations {

	public static void main(String[] args) {
		List<List<Integer>> solution = permute(new int[] {1,2,3});
		System.out.println(Arrays.toString(solution.toArray()));
	}
	
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> solution = new ArrayList<>();
		backtrack(solution, new ArrayList<>(), nums);
		return solution;
	}
	
	public static void backtrack(List<List<Integer>> sol, List<Integer> tempList, int[] nums) {
		if(tempList.size() == nums.length) {
			sol.add(new ArrayList<>(tempList));
		} else {
			for(int i = 0; i < nums.length; i++) {
				if(tempList.contains(nums[i])) {
					continue;
				}
				tempList.add(nums[i]);
				backtrack(sol, tempList, nums);
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
