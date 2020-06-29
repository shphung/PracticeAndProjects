package Tree;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class TreeNode {

	int val;
	
	TreeNode left;
	TreeNode right;
	
	TreeNode() {}
	
	TreeNode(int val) {this.val = val;}
	
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public static void toString(TreeNode node) {
		if(node == null) {
        	return;
        }
		System.out.print(node.val + " ");
		toString(node.left);
		toString(node.right);
	}
}
