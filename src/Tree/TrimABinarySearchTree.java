package Tree;
/*
 * Leetcode Practice: #669. Trim a Binary Search Tree
 * 
 * Given a binary search tree and the lowest and highest boundaries as
 * L and R, trim the tree so that all its elements lies in [L, R] (R >= L).
 * You might need to change the root of the tree, so the result should
 * return the new root of the trimmed binary search tree.
 * 
 * Example 1:
 * Input:    1
 *          / \
 *         0   2
 *         
 *         L = 1
 *         R = 2
 * 
 * Output:   1
 * 			  \
 * 			   2
 * 
 * Example 2:
 * Input:    3
 *          / \
 *         0   4
 *          \
 *           2
 *          /
 *         1
 *         
 *         L = 1
 *         R = 3
 * 
 * Output:   3
 *          /
 *         2
 *        /
 *       1
 */
public class TrimABinarySearchTree {

	public static void main(String[] args) {
		TreeNode tree1 = new TreeNode(1);
		tree1.left = new TreeNode(0);
		tree1.right = new TreeNode(2);

		TreeNode.toString(tree1);
		System.out.println();
		TreeNode solution = trimBST(tree1, 1, 3);
		TreeNode.toString(solution);
		System.out.println();
		

		TreeNode tree2 = new TreeNode(3);
		tree2.left = new TreeNode(0);
		tree2.left.right = new TreeNode(2);
		tree2.left.right.left = new TreeNode(1);
		tree2.right = new TreeNode(4);
		
		TreeNode.toString(tree2);
		System.out.println();
		solution = trimBST(tree2, 1, 3);
		TreeNode.toString(solution);
		System.out.println();
	}

	public static TreeNode trimBST(TreeNode root, int L, int R) {
		if(root == null) return root;
		if(root.val > R) return trimBST(root.left, L, R);
		if(root.val < L) return trimBST(root.right, L, R);
		
		root.left = trimBST(root.left, L, R);
		root.right = trimBST(root.right, L, R);
		return root;
    }
}
