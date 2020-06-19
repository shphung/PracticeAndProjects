package Array;

import java.util.Arrays;
import java.util.List;

/*
 * Leetcode Practice: #832. Flipping an Image
 * 
 * Given a binary matrix A, we want to flip the image horizontally, then invert it,
 * and return the resulting image.
 * 
 * To flip an image horizontally means that each row of the image is reversed. For
 * example, flipping [1,1,0] horizontally results in [0,1,1].
 * 
 * To invert an image means that each 0 is replaced by 1, and 1 each is replaced by 0.
 * For example, inverting [0,1,1] results in [1,0,0].
 *
 * Example 1:
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse the row: [[0,1,1],[1,0,1],[0,0,0]]
 * Then, reverse the image: [[1,0,0],[0,1,0],[1,1,1]]
 * 
 * Example 2:
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse the row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]
 * Then, reverse the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 
 * Notes:
 *  - 1 <= A.length = A[0].length <= 20
 *  - 0 <= A[i][j] <= 1
 */
public class FlippingAnImage {

	public static void main(String[] args) {
		int[][] problem = new int[][] {{1,1,0},{1,0,1},{0,0,0}};
		toString(problem);
		int[][] solution = flipAndInvertImage(problem);
		toString(solution);
		
		problem = new int[][] {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		toString(problem);
		solution = flipAndInvertImage(problem);
		toString(solution);
	}
	
	public static int[][] flipAndInvertImage(int[][] A) {
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length/2; j++) {
				int temp = A[i][j];
				A[i][j] = A[i][A[i].length - 1 - j];
				A[i][A[i].length - 1 - j] = temp;
			}
		}
		
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				if(A[i][j] == 0) {
					A[i][j] = 1;
				} else if(A[i][j] == 1) {
					A[i][j] = 0;
				}
			}
		}
		
		return A;
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
