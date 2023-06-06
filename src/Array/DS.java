package Array;

import java.util.Arrays;
import java.util.List;
/*
 * HackerRank: 2D Array - DS
 * 
 * Given a 6 x 6 2D array, arr:
 * 		1 1 1 0 0 0
 * 		0 1 0 0 0 0
 * 		1 1 1 0 0 0
 * 		0 0 0 0 0 0
 * 		0 0 0 0 0 0
 * 		0 0 0 0 0 0
 * 	An hourglass in A is a subset of values with indices falling in this pattern in arr's graphical representation:
 * 		a b c
 * 		  d
 * 		e f g
 * There are 16 hourglasses in arr. An hourglass sum is the sum of an hourglass' values. Calculate the hourglass
 * sum for every hourglass in arr, then print the maximum hourglass sum. The array will always be 6 x 6.
 * 
 */
public class DS {

	public static void main(String[] args) {
		int result = hourglassSum(Arrays.asList(
				Arrays.asList(-9, -9, -9,  1,  1,  1),
				Arrays.asList( 0, -9,  0,  4,  3,  2),
				Arrays.asList(-9, -9, -9,  1,  2,  3),
				Arrays.asList( 0,  0,  8,  6,  6,  0),
				Arrays.asList( 0,  0,  0, -2,  0,  0),
				Arrays.asList( 0,  0,  1,  2,  4,  0)));
		System.out.println("Expected result: 28\tActual result: " + result);
		
		result = hourglassSum(Arrays.asList(
				Arrays.asList( 1,  1,  1,  0,  0,  0),
				Arrays.asList( 0,  1,  0,  0,  0,  0),
				Arrays.asList( 1,  1,  1,  0,  0,  0),
				Arrays.asList( 0,  0,  2,  4,  4,  0),
				Arrays.asList( 0,  0,  0,  2,  0,  0),
				Arrays.asList( 0,  0,  1,  2,  4,  0)));
		System.out.println("Expected result: 19\tActual result: " + result);
	}
	
	public static int hourglassSum(List<List<Integer>> arr) {
		int maxSum = Integer.MIN_VALUE;
		for(int row = 0; row < arr.size()-2; row++) {
			for(int col = 0; col < arr.get(row).size()-2; col++) {
	            int topLeft 		= arr.get(row+0).get(col+0);
	            int topCenter 		= arr.get(row+0).get(col+1);
	            int topRight 		= arr.get(row+0).get(col+2);
	            
	            int middleCenter 	= arr.get(row+1).get(col+1);
	            
	            int bottomLeft 		= arr.get(row+2).get(col+0);
	            int bottomCenter 	= arr.get(row+2).get(col+1);
	            int bottomRight	 	= arr.get(row+2).get(col+2);
	            
	            int hourglass = 0;
	            hourglass = topLeft + topCenter + + topRight + middleCenter + bottomLeft + bottomCenter + bottomRight;
	            maxSum = Math.max(maxSum, hourglass);
//	            System.out.println(topLeft + "\t" + topCenter + "\t" + topRight);
//	            System.out.println("\t" + middleCenter + "\t");
//	            System.out.println(bottomLeft + "\t" + bottomCenter + "\t" + bottomRight);
//				System.out.println(maxSum + " " + hourglass + "\n");
	        }
//			System.out.println(" ");
        }
		return maxSum;
	}
}
