/* Och1r1
Problem Description:
  You are given the root of a binary tree root. Invert the binary tree and return its root.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class invertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        preOrder(root);

        return root;
    }

    public static void preOrder(TreeNode node) {
        if (node == null) return; // Base case: empty node

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        // Traverse left subtree
        preOrder(node.left);

        // Traverse right subtree
        preOrder(node.right);
    }
}