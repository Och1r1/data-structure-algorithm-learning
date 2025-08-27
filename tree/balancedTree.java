import java.util.*;

public class balancedTree {
    public boolean isBalanced(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        if(root == null){
            return true;
        }
        qu.add(root);
        
        while(true){
            int numberOfNodes = qu.size();

            for(int i = 0; i < numberOfNodes; i++){
                TreeNode treePart = qu.poll();
                if(treePart.left == null && treePart.right != null){
                    qu.add(treePart.right);
                    if(treePart.left.left != null || treePart.left.right != null){
                        return false;
                    }
                }
                if(treePart.right == null && treePart.left != null){
                    qu.add(treePart.left);
                    if(treePart.right.left != null || treePart.right.right != null){
                        return false;
                    }
                }

                if(numberOfNodes == 0 && qu.size() == 0){
                    return true;
                }
            }
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