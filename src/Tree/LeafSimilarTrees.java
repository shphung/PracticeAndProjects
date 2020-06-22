package Tree;

import java.util.ArrayList;
import java.util.List;
/*
 * Leetcode Practice: #872. Leaf-Similar Trees
 * 
 * Consider all the leaves of a binary tree.  From left to right order, the values of
 * those leaves form a leaf value sequence.
 * 
 * Example:
 * 		       3
 *           /   \
 *         5       1
 *        / \     / \
 *       6   2   9   8
 *          / \
 *         7   4
 * For example, in the given tree above, the leaf value sequence is (6,7,4,9,8).
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * 
 * Return true if and only if the two given trees with head nodes root1 and
 * root2 are leaf-similar.
 * 
 * Constraints:
 * 	- Both of the given trees will have between 1 and 200 nodes.
 *  - Both of the given trees will have values between 0 and 200. 
 */
public class LeafSimilarTrees {

	public static void main(String[] args) {
		TreeNode tree1 = new TreeNode(3);
		tree1.left = new TreeNode(5);
		tree1.left.left = new TreeNode(6);
		tree1.left.right = new TreeNode(2);
		tree1.left.right.left = new TreeNode(7);
		tree1.left.right.right = new TreeNode(4);
		tree1.right = new TreeNode(1);
		tree1.right.left = new TreeNode(9);
		tree1.right.right = new TreeNode(8);
		
		TreeNode tree2 = new TreeNode(3);
		tree2.left = new TreeNode(5);
		tree2.left.left = new TreeNode(6);
		tree2.left.right = new TreeNode(2);
		tree2.left.right.left = new TreeNode(7);
		tree2.left.right.right = new TreeNode(4);
		tree2.right = new TreeNode(1);
		tree2.right.left = new TreeNode(9);
		tree2.right.right = new TreeNode(8);
		
		boolean sol = leafSimilar(tree1, tree2);
		System.out.println(sol);
	}

	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
		//Assuming 2 empty trees are valid input, they will have the same sequence
		//Therefore they will still  be leaf similar
        if(root1 == null && root2 == null) {
            return true;
        //If either or trees while the other is not, return false
        } else if(root1 == null || root2 == null) {
            return false;
        }
        
        List<Integer> sequence1 = new ArrayList<Integer>();
        List<Integer> sequence2 = new ArrayList<Integer>();
        
        //DFS for both tree1 and tree2;
        depthFirstSearch(root1, sequence1);
        depthFirstSearch(root2, sequence2);
        
        //If sequence found does not match can immediately return false
        if(sequence1.size() != sequence2.size()) {
            return false;
        }
        
        //If any number in the sequence does not match the second sequence number
        //Return false
        for(int i = 0; i < sequence1.size(); i++) {
            if(sequence1.get(i) != sequence2.get(i)) {
                return false;
            }
        }
        
        //If we reach this line, both trees produce the same sequence values and length
        //Therefore they are leaf-similar
        return true;
    }
    
	//Post order depth first search
    public static void depthFirstSearch(TreeNode node, List<Integer> list) {
        if(node != null) {
        	if(node.left == null && node.right == null) {
                list.add(node.val);
            }
            depthFirstSearch(node.left, list);
            depthFirstSearch(node.right, list);
        }
    }
}
