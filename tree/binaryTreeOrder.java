/* Och1r1
Problem Description:

Given a binary tree root, return the level order traversal of it as a nested list, 
where each sublist contains the values of nodes at a particular level in the tree, from left to right.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;


public class binaryTreeOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        Queue<TreeNode> qu_child = new LinkedList<>();
        if(root != null){
            qu.add(root);
        }
        else{
            return result;
        }

        while(true){
            if(qu.isEmpty()){
                result.add(values);
                values = new ArrayList<>();
                if(qu_child.isEmpty()){
                    break;
                }
                qu = qu_child;
                qu_child = new LinkedList<>();
            }

            TreeNode node = qu.poll();
            values.add(node.val);
            if(node.left != null){
                qu_child.add(node.left);
            }
            if(node.right != null){
                qu_child.add(node.right);
            }

        }
        return result;
    }
}
