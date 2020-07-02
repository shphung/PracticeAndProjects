package Array;

import java.util.HashSet;
import java.util.Set;

/*
 * Leetcode Practice: #961. N-Repeated Element in Size 2N Array
 * 
 * In a array A of size 2N, there are N+1 unique elements, and exactly
 * one of these elements is repeated N times.
 * 
 * Return the element repeated N times.
 * 
 * Example 1:
 * 	Input: [1,2,3,3]
 *  Output: 3
 *	
 * Example 2:
 * 	Input: [2,1,2,5,3,2]
 *  Output: 2
 *  
 * Example 3:
 *  Input: [5,1,5,2,5,3,5,4]
 *  Output: 5
 *  
 * Note:
 *  - 4 <= A.length <= 10000
 *  - 0 <= A[i] < 10000
 *  - A.length is even
 */
public class NRepeatedElementInSize2NArray {

	public static void main(String[] args) {
		System.out.println(repeatedNTimes(new int[] {1,2,3,3}));
		System.out.println(repeatedNTimes(new int[] {2,1,2,5,3,2}));
		System.out.println(repeatedNTimes(new int[] {5,1,5,2,5,3,5,4}));
	}

	public static int repeatedNTimes(int[] A) {
		Set<Integer> set = new HashSet<Integer>();
        int numOfRepeated = A.length / 2;
        for(int i = 0; i < A.length - 1; i++) {
        	if(!set.contains(A[i])) {
        		set.add(A[i]);
        	} else {
        		continue;
        	}
            int count = 1;
            for(int j = i + 1; j < A.length; j++) {
            	
                if(A[i] == A[j]) {
                    count++;
                }
                if(count == numOfRepeated) {
                    return A[i];
                }
            }
        }
        return 0;
    }
}
