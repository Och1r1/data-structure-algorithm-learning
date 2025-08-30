import java.util.HashMap;
import java.util.Stack;

/* Helpful tip that i found from leetcode comment section by sliks
Two different concepts:

diameter = height of left tree + height of right tree
height = 1 + max(height of left tree, height of right tree)
Keep track of the height and calculate its diameter for each node all the way to the root.
 */

public class diameterBinaryTree {
    public static int diameterOfBinaryTree(TreeNode root) {
        // to track height of every single node in the tree
        HashMap<TreeNode, Integer> map = new HashMap<>();
        Stack<TreeNode> st = new Stack<>();
        int diameter = 0;

        if(root != null){
            st.add(root);
        }

        while(!st.isEmpty()){
            // i was poping at first. But in postorder traversal, we will start popping when we reach the bottom.
            TreeNode node = st.peek();

            if(node.left != null && !map.containsKey(node.left)){
                st.push(node.left);
            } else if (node.right != null && !map.containsKey(node.right)){
                st.push(node.right);
            }else{
                st.pop();
                int left = map.getOrDefault(node.left, 0);
                int right = map.getOrDefault(node.right, 0);

                map.put(node, 1 + Math.max(left, right));

                diameter = Math.max(diameter, right + left);
            }
        }

        return diameter;
    }
}
