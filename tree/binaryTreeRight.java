/* Och1r1
Problem Description:

Given the root of a binary tree, imagine yourself standing on the right side of it, 
return the values of the nodes you can see ordered from top to bottom.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class binaryTreeRight {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        Queue<TreeNode> qu_child = new LinkedList<>();
        if(root != null){
            qu.add(root);
        }
        else{
            return result;
        }

        while(true){
            TreeNode node = qu.poll();

            if(node.left != null){
                qu_child.add(node.left);
            }
            if(node.right != null){
                qu_child.add(node.right);
            }

            if(qu.isEmpty()){
                result.add(node.val);
                if(qu_child.isEmpty()){
                    break;
                }
                qu = qu_child;
                qu_child = new LinkedList<>();
            }
        }

        return result;
    }
}
