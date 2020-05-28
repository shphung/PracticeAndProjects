import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * Leetcode Practice: #56. Merge Intervals
 * 
 * Given a collection of intervals, merge all overlapping intervals.
 * 
 * Example 1:
 * 	Input: [[1,3],[2,6],[8,10],[15,18]]
 * 	Output: [[1,6],[8,10],[15,18]]
 * 	Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * 
 * Example 2:
 * 	Input: [[1,4],[4,5]]
 * 	Output: [[1,5]]
 * 	Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
public class MergeIntervals {

	public static void main(String[] args) {
		int[][] solution = new int[][] {{1,3},{2,6},{8,10},{15,18}};
		toString(solution);
		solution = merge(solution);
		toString(solution);
		
		System.out.println();
		solution = new int[][] {{1,4},{4,5}};
		toString(solution);
		solution = merge(solution);
		toString(solution);
	}

	public static int[][] merge(int[][] intervals) {
		Collections.sort(Arrays.asList(intervals), new IntervalComparator());
		LinkedList<int[]> merged = new LinkedList<>();
		for(int[] interval : intervals) {
			if(merged.isEmpty() || merged.getLast()[1] < interval[0]) {
				merged.add(interval);
			} else {
				merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
			}
		}
		return merged.toArray(new int[merged.size()][]);
    }
	
	private static class IntervalComparator implements Comparator<int[]> {
		@Override
		public int compare(int[] a, int[] b) {
			return a[0] < b[0] ? -1 : a[0] == b[0] ? 0 : 1;
		}
	}
	
	public static void toString(int[][] matrix) {
		System.out.print("[");
		for(int i = 0; i < matrix.length; i++) {
			System.out.print("[");
			for(int j = 0; j < matrix[0].length; j++) {
				if(j == matrix[0].length - 1) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + ",");
				}
			}
			if(i == matrix.length - 1) {
				System.out.print("]");
			} else {
				System.out.print("],");
			}
		}
		System.out.println("]");
	}
}
