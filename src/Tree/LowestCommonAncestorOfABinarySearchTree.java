package Tree;
/*
 * Leetcode Practice: #235. Lowest Common Ancestor of a Binary Search Tree
 * 
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * 
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined
 * between two nodes p and q as the lowest node in T that has both p and q as descendants (where
 * we allow a node to be a descendant of itself).”
 * 
 * Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]
 * 	              6
 *           /         \
 *         2             8
 *       /   \         /   \
 *     0       4     7       9
 *           /   \
 *          3     5
 * 
 * Example 1:
 * 	Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 *  Output: 6
 *  Explanation: The LCA of nodes 2 and 8 is 6.
 * 
 * Example 2:
 * 	Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 *  Output: 2
 *  Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of
 *  itself according to the LCA definition.
 *  
 * Constraints:
 * - All of the nodes' values will be unique.
 * - p and q are different and both values will exist in the BST.
 */
public class LowestCommonAncestorOfABinarySearchTree {

	public static void main(String[] args) {
		TreeNode tree1 = new TreeNode(6);
		tree1.left = new TreeNode(2);
		tree1.left.left = new TreeNode(0);
		tree1.left.right = new TreeNode(4);
		tree1.left.right.left = new TreeNode(3);
		tree1.left.right.right = new TreeNode(5);
		tree1.right = new TreeNode(8);
		tree1.right.left = new TreeNode(7);
		tree1.right.right = new TreeNode(9);
		
		TreeNode p = new TreeNode(2);
		TreeNode q = new TreeNode(8);
		
		
		TreeNode node = lowestCommonAncestor(tree1, p, q);
		System.out.println(node.val);
	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pVal = p.val;
        int qVal = q.val;
        TreeNode node = root;
        while (node != null) {
            int parentVal = node.val;

            if (pVal > parentVal && qVal > parentVal) {
                node = node.right;
            } else if (pVal < parentVal && qVal < parentVal) {
                node = node.left;
            } else {
                return node;
            }
        }
        return null;
    }
}
