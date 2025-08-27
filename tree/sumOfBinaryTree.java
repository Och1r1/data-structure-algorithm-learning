// so i thought before solving leetcode tree questions, i need to understand at least basic questions about tree to familiriaze with my self.
// recursion version:
public class sumOfBinaryTree {
    public int sum(TreeNode root){
        if(root == null){
            return 0;
        }
        else{
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);

            return root.val + leftSum + rightSum;
        }
    }
}

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