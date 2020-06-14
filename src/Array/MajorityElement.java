package Array;
/*
 * Leetcode Practice: #169. Majority Element
 * 
 * Given an array of size n, find the majority element. The
 * majority element is the element that appears more than
 * [ n / 2 ] times.
 * 
 * You may assume the array is non-empty and the majority
 * element always exists in the array.
 * 
 * Example 1:
 * 	Input: [3,2,3]
 * 	Output: 3
 * 
 * Example 2:
 * 	Input: [2,2,1,1,1,2,2]
 * 	Output: 2
 */
public class MajorityElement {

	public static void main(String[] args) {
		//Test cases
		System.out.println(majorityElement(new int[] {3,2,3}));
		
		System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
		
		System.out.println(majorityElement(new int[] {7,8,9,9,9,4,9,2,1,9,9}));
		
		System.out.println(majorityElement(new int[] {9,9,9,9,9,9,9}));
		
		System.out.println(majorityElement(new int[] {-1,100,2,100,100,4,100}));
	}

	public static int majorityElement(int[] nums) {
        int majority = 0;
        int numOfAppearances = 0;
        
        //i = element
        for(int i = 0; i < nums.length; i++) {
        	//j = check for duplicates
        	for(int j = 0; j < nums.length; j++) {
        		//If i has duplicates, keep track of how many
        		if(nums[i] == nums[j]) {
        			numOfAppearances++;
        		}
        		//Exit case
        		//If an element shows up more than half the array size
        		//that element is already majority and no other element can be majority
        		if(numOfAppearances > nums.length / 2) {
            		majority = nums[i];
            		return majority;
            	}
        	}
        	numOfAppearances = 0;
        }
        return majority;
    }
}
