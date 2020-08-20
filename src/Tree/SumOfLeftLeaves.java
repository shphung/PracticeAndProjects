package Tree;
/*
 * Leetcode Practice: #404. Sum of Left Leaves
 * 
 * Find the sum of all left leaves in a given binary tree.
 * 
 * Example:
 * 		       3
 *           /   \
 *         9       20
 *                /  \
 *              15    7
 *       
 * There are two left leaves in the binary tree, with values 9 and 15 respectively.
 * Return 24.
 */
public class SumOfLeftLeaves {

	public static void main(String[] args) {
		TreeNode tree1 = new TreeNode(3);
		tree1.left = new TreeNode(9);
		tree1.right = new TreeNode(20);
		tree1.right.left = new TreeNode(15);
		tree1.right.right = new TreeNode(7);
		
		System.out.println(sumOfLeftLeaves(tree1));
	}

	public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int sum = 0;
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                sum += sumOfLeftLeaves(root.left);
            }
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }
}
