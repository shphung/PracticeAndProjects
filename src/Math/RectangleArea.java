package Math;
/*
 * Leetcode Practice: #223. Rectangle Area
 * 
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * 
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 * (A, B) : (-3, 0)		(C, D) : (3, 4)		(E, F) : (0, -1)		(G, H) : (9, 2)
 * 
 * Example 1:
 * 	Input: A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2
 *  Output: 45
 * 
 * Note:
 * - Assume that the total area is never beyond the maximum possible value of int.
 */
public class RectangleArea {

	public static void main(String[] args) {
		System.out.println(computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
	}

	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areaOfSqrA = (C-A) * (D-B);
        int areaOfSqrB = (G-E) * (H-F);
        
        int left = Math.max(A, E);
        int right = Math.min(G, C);
        int bottom = Math.max(F, B);
        int top = Math.min(D, H);
        
        int overlap = 0;
        if(right > left && top > bottom)
             overlap = (right - left) * (top - bottom);
        
        return areaOfSqrA + areaOfSqrB - overlap;
    }
}
