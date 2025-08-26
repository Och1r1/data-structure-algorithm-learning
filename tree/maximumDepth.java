/* Och1r1
Problem Description:

Given the root of a binary tree, return its depth.

The depth of a binary tree is defined as the number of nodes 
along the longest path from the root node down to the farthest leaf node.


 */
import java.util.*;

public class maximumDepth {
    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        Queue<TreeNode> qu = new LinkedList<>();
        int result = 0;
        qu.add(root);

        while(true){
            int numberOfNodes = qu.size();
            if(numberOfNodes == 0){
                return result;
            }

            for(int i = 0; i < numberOfNodes; i++){
                TreeNode hold = qu.poll();
                if(hold.left != null){
                    qu.add(hold.left);
                }
                if(hold.right != null){
                    qu.add(hold.right);
                }
            }
            result++;
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