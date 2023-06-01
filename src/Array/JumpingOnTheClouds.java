package Array;

import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {
	public static void main(String[] args) {
		int result = jumpingOnClouds(Arrays.asList(0, 0, 0, 1, 0, 0));
		System.out.println("Expected result: 3\tActual result: " + result);
		
		result = jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0));
		System.out.println("Expected result: 4\tActual result: " + result);
	}
	
	public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        for(int i = 0; i < c.size()-1; i++) {
        	if(i < c.size()-2 && c.get(i+2) == 0) {
        		i++;
        		jumps++;
        	} else {
        		jumps++;
        	}
        }
        return jumps;
    }
}
