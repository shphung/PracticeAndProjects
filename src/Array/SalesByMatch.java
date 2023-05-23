package Array;

import java.util.*;

/*
 * There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
	Example
	n=7
	ar=[1,2,1,2,1,3,2]
	There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is 2.
	
	Function Description
	Complete the sockMerchant function in the editor below.
	sockMerchant has the following parameter(s):
	int n: the number of socks in the pile
	int ar[n]: the colors of each sock
	
	Returns
	int: the number of pairs
	
	Input Format
	The first line contains an integer , the number of socks represented in .
	The second line contains  space-separated integers, , the colors of the socks in the pile.
	
	Constraints
	1 <= n <= 100
	1 <= ar[i] <= 100 where 0 <= i < n
	
	Sample Input
	STDIN                       Function
	-----                       --------
	9                           n = 9
	10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
	
	Sample Output
	3
	
	Another Input
	10
	1, 1, 3, 1, 2, 1, 3, 3, 3, 3
	
	Another Output
	4
 */
public class SalesByMatch {

	public static void main(String[] args) {
		int result = sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
		System.out.println("Expected result: 3\tActual result: " + result);
		
		result = sockMerchant(10, Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3));
		System.out.println("Expected result: 4\tActual result: " + result);
	}

	/*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */
    public static int sockMerchant(int n, List<Integer> ar) {
    	// Write your code here
        //n = number of socks
        //ar = list of socks (and their color)
        int pairs = 0;
        
        boolean[] myArr = new boolean[n];
        
        for(int i = 0; i < n - 1; i++) {
            if(myArr[i]) {
                continue;
            } else {
                for(int j = i+1; j < n; j++) {
                    if(myArr[j]) { 
                        continue;
                    } else if (ar.get(i) == ar.get(j)) {
                        myArr[i] = true;
                        myArr[j] = true;
                        pairs++;
                        break;
                    }
                }
            }
        }
        return pairs;
    }
}
