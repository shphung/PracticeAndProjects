package DynamicProgramming;
/*
 * Leetcode Practice: #304. Range Sum Query 2D - Immutable
 * 
 * Given a 2D matrix matrix, find the sum of the elements inside the rectangle defined by its upper
 * left corner (row1, col1) and lower right corner (row2, col2).
 * 
 * Example 1:
 * 	Given matrix = [
 * 	[3, 0, 1, 4, 2],
 * 	[5, 6, 3, 2, 1],
 * 	[1, 2, 0, 1, 5],
 * 	[4, 1, 0, 1, 7],
 * 	[1, 0, 3, 0, 5]
 * ]
 * 
 * sumRegion(2, 1, 4, 3) -> 8
 * sumRegion(1, 1, 2, 2) -> 11
 * sumRegion(1, 2, 2, 4) -> 12
 * 
 * Example 2:
 * 	Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 	Output: [4,9]
 * 
 * Note:
 * 	1. You may assume that the matrix does not change.
 *  2. There are many calls to sumRegion function.
 *  3. You may assume that row1 <= row2 and col1 <= col2.
 */
public class RangeSumQuery2DImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private int[][] matrix;
    
    public RangeSumQuery2DImmutable(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i = row1; i <= row2; i++) {
            for(int j = col1; j <= col2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
