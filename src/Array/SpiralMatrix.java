package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Leetcode Practice: #54. Spiral Matrix
 * 
 * Given a matrix of m x n elements (m rows, n columns), return all
 * elements of the matrixin spiral order.
 * 
 * Example 1:
 * 	Input:
 *		[
 *			[1,2,3],
 *			[4,5,6],
 *			[7,8,9]
 *		],
 *	Output: [1,2,3,6,9,8,7,4,5]
 *	
 * Example 2:
 * 	Input:
 *		[
 *			[1, 2, 3, 4],
 *			[5, 6, 7, 8],
 *			[9,10,11,12]
 *		],
 *	Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] problem = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		toString(problem);
		List<Integer> solution = spiralOrder(problem);
		System.out.println(Arrays.toString(solution.toArray()) + "\n");
		
		problem = new int[][] {{1, 2, 3, 4},{5, 6, 7, 8},{9,10,11,12}};
		toString(problem);
		solution = spiralOrder(problem);
		System.out.println(Arrays.toString(solution.toArray()) + "\n");
	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
		if(matrix.length == 0) {
			return list;
		}
		int row1 = 0, row2  = matrix.length - 1;
		int column1 = 0, column2 = matrix[0].length - 1;
		while(row1 <= row2 && column1 <= column2) {
			//Top row
			for(int column = column1; column <= column2; column++) {
				list.add(matrix[row1][column]);
			}
			//Right column excluding first element
			for(int row = row1 + 1; row <= row2; row++) {
				list.add(matrix[row][column2]);
			}
			if(row1 < row2 && column1 < column2) {
				//Bottom row backwards excluding first element
				for(int column = column2 - 1; column > column1; column--) {
					list.add(matrix[row2][column]);
				}
				//Left column backwards excluding element
				for(int row = row2; row > row1; row--) {
					list.add(matrix[row][column1]);
				}
			}
			row1++;
			row2--;
			column1++;
			column2--;
		}
		return list;
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
