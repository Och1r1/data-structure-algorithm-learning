// so i thought before solving leetcode tree questions, i need to understand at least basic questions about tree to familiriaze with my self.
// recursion version:
/*
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
}*/

/*
✅ So:
DFS → recursion OR stack - DFS gedeg cin preorder l gsen ug, ehleed neg tree ruugee shumbana
BFS → queue - Level-by-level, level eer n yvna gsen ug
 */

import java.util.Queue;
import java.util.LinkedList;

public class sumOfBinaryTree{
    public int sum(TreeNode root){
        if(root == null){
            return 0;
        }

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        int total = 0;

        while(!qu.isEmpty()){
            TreeNode cur = qu.poll();
            total += cur.val;
            if(cur.left != null) qu.add(cur.left);
            if(cur.right != null) qu.add(cur.right);
        }

        return total;
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