public class lowestCommonAncestorBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int lo = Math.min(p.val, q.val);
        int hi = Math.max(p.val, q.val);

        TreeNode cur = root;
        while (cur != null) {
            if (cur.val < lo) {
                cur = cur.right;   // both nodes are in the right subtree
            } else if (cur.val > hi) {
                cur = cur.left;    // both nodes are in the left subtree
            } else {
                return cur;        // lo <= cur.val <= hi -> LCA
            }
        }
        return null; // shouldn't happen if p and q exist in the tree
    }
}
