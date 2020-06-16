package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Leetcode Practice: #118. Pascal's Triangle
 * 
 * Given a non-negative integer numRows, generate
 * the first numRows of Pascal's Triangle.
 * 
 * Input: 5
 * Output:
 * [
 * 		[1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class PascalsTriangle {

	public static void main(String[] args) {
		List<List<Integer>> solution = generate(5);
		System.out.println(Arrays.toString(solution.toArray()));
		
		solution = generate(6);
		System.out.println(Arrays.toString(solution.toArray()));

		solution = generate(15);
		System.out.println(Arrays.toString(solution.toArray()));
	}
	
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<>();
		List<Integer> tempList = new ArrayList<>();
		//# of rows to generate
		for(int currentRow = 1; currentRow <= numRows; currentRow++) {
			//Rows 1 and row, will simply add 1 to list
			if(currentRow == 1) {
				tempList.add(1);
			} else if(currentRow == 2) {
				//To separate reference
				tempList = new ArrayList<>(triangle.get(currentRow - 2));
				tempList.add(1);
			} else {
				//Get 2 copies of previous list, 1 to access for correct values, 1 to modify
				tempList = new ArrayList<>(triangle.get(currentRow - 2));
				List<Integer> addList = new ArrayList<>(triangle.get(currentRow - 2));
				//Add pairs
				for(int i = 0; i < tempList.size() - 1; i++) {
					addList.set(i+1, tempList.get(i) + tempList.get(i+1));
				}
				//Add to new list
				addList.add(1);
				//Rereference
				tempList = addList;
			}
			//Add to final list
			triangle.add(tempList);
		}
		return triangle;
	}
}
