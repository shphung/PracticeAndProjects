package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Leetcode Practice: #39. Combination Sum
 * 
 * Given a set of candidates numbers (candidates) (without duplicates)
 * and a target number (target), find all unique combinations in candidate
 * where the candidate numbers sum to target.
 * 
 * The same repeated number may be chosen from candidates unlimited number of times.
 * 
 * Note:
 * 		- All numbers (including targget) will be positive integers.
 * 		- The solution set must not contain duplicate combinations.
 *
 * Example 1:
 * Input: candidates = [2,3,6,7], target = 7,
 * A Solution set is:
 * [
 * 	[7],
 * 	[2,2,3]
 * ]
 * 
 * Example 2:
 * Input: candidates = [2,3,5], target = 8,
 * A Solution set is:
 * [
 * 	[2,2,2,2],
 * 	[2,3,3],
 * 	[3,5]
 * ]
 */
public class CombinationSum {

	public static void main(String[] args) {
		List<List<Integer>> solution = combinationSum(new int[] {2, 3, 6, 7}, 7);
		System.out.println(Arrays.toString(solution.toArray()));
		
		solution = combinationSum(new int[] {2, 3, 5}, 8);
		System.out.println(Arrays.toString(solution.toArray()));
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> solutionSet = new ArrayList<>();
		Arrays.sort(candidates);
		backtrack(solutionSet, new ArrayList<Integer>(), candidates, target, 0);
		return solutionSet;
	}
	
	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int remain, int start) {
		if(remain < 0)
			return;
		//If remain == 0, target is met, return list
		else if(remain == 0)
			list.add(new ArrayList<>(tempList));
		else {
			for(int i = start; i < candidates.length; i++) {
				//Add possible candidate[i]
				tempList.add(candidates[i]);
				//Backtrack based on new target, remain - candidate[i]
				backtrack(list, tempList, candidates, remain - candidates[i], i);
				//Remove candidate[i] if target not met and all current combinations were tried
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
