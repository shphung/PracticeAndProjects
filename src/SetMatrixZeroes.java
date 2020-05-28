import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Leetcode Practice: #73. Set Matrix Zeroes
 * 
 * Given a (m x n) matrix, if an element is 0, set its entire
 * row and column to 0. Do it in-place.
 * 
 * Example 1:
 * 	Input:
 *		[
 *			[1,1,1],
 *			[1,0,1],
 *			[1,1,1]
 *		]
 *	Output:
 * 		[
 *			[1,0,1],
 *			[0,0,0],
 *			[1,0,1]
 *		]
 *	
 * Example 2:
 * 	Input:
 *		[
 *			[0,1,2,0],
 *			[3,4,5,2],
 *			[1,3,1,5]
 *		]
 *	Output:
 * 		[
 *			[0,0,0,0],
 *			[0,4,5,0],
 *			[0,3,1,0]
 *		]
 *
 * Follow up:
 * 	- A straight forward solution using O(mn) solution is probably a bad idea.
 * 	- A simple improvement uses O(m + n) space, but still not the best solution.
 *  - Could you devise a constant space solution
 */
public class SetMatrixZeroes {

	public static void main(String[] args) {
		int[][] solution = new int[][] {{1,1,1},{1,0,1},{1,1,1}};
		toString(solution);
		setZeroes(solution);
		toString(solution);
		
		solution = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		toString(solution);
		setZeroes(solution);
		toString(solution);
	}
	
	public static void setZeroes(int[][] matrix) {
		//First column needs to be 0, true
		//else false
		boolean isColumn = false;
		
		//First iteration to find 0 locations
		for(int i = 0; i < matrix.length; i++) {
			//If column is 0
			if(matrix[i][0] == 0) {
				isColumn = true;
			}
			//Wherever there is a 0, set that row / column's first element to 0
			for(int j = 1; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		
		//Whatever row / column has first element as 0, set the rest to 0
		for(int i = 1; i < matrix.length; i++) {
			for(int j = 1; j < matrix[0].length; j++) {
				if(matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		
		//If row 1 is 0, set entire row to 0
		if(matrix[0][0] == 0) {
			for(int j = 0; j < matrix[0].length; j++) {
				matrix[0][j] = 0;
			}
		}
		
		//If column 1 is 0, set entire column to 0
		if(isColumn) {
			for(int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}
		
		//Brute force solution
//		Set<Integer> rows = new HashSet<Integer>();
//		Set<Integer> columns = new HashSet<Integer>();
//		
//		for(int i = 0; i < matrix.length; i++) {
//			for(int j = 0; j < matrix[0].length; j++) {
//				if(matrix[i][j] == 0) {
//					rows.add(i);
//					columns.add(j);
//				}
//			}
//		}
//		
//		for(int i = 0; i < matrix.length; i++) {
//			for(int j = 0; j < matrix[0].length; j++) {
//				if(rows.contains(i) || columns.contains(j)) {
//					matrix[i][j] = 0;
//				}
//			}
//		}
	}
	
	public static void toString(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			System.out.print("[");
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] < 10 && j < matrix[0].length - 1) {
					System.out.print(" " + matrix[i][j] + ",");
				} else if(matrix[i][j] < 10 && j == matrix[0].length - 1) {
					System.out.print(" " + matrix[i][j]);
				} else if(j < matrix[0].length - 1) {
					System.out.print(matrix[i][j] + ",");
				} else {
					System.out.print(matrix[i][j]);
				}
			}
			System.out.print("]\n");
		}
		System.out.println();
	}
}
