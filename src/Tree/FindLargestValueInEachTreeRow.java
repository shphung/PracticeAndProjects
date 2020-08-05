package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Leetcode Practice: #872. Leaf-Similar Trees
 * 
 * Consider all the leaves of a binary tree.  From left to right order, the values of
 * those leaves form a leaf value sequence.
 * 
 * Example:
 * 		       1
 *           /   \
 *         3       2
 *        / \       \
 *       5   3       9
 * 
 * Output: [1, 3, 9]
 */
public class FindLargestValueInEachTreeRow {

	public static void main(String[] args) {
		TreeNode tree1 = new TreeNode(1);
		tree1.left = new TreeNode(3);
		tree1.left.left = new TreeNode(5);
		tree1.left.right = new TreeNode(3);
		tree1.right = new TreeNode(2);
		tree1.right.right = new TreeNode(9);
		
		System.out.println(largestValues(tree1));
	}


    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) 
            return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++) {
                TreeNode current = q.remove();
                if(current.val > max) {
                    max = current.val;
                }
                
                if(current.left != null) {
                    q.add(current.left);
                }
                if(current.right != null) {
                    q.add(current.right);
                }
            }
            list.add(max);
        }
        return list;
    }
}
