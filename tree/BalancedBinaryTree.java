import java.util.Stack;
import java.util.HashMap;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        HashMap<TreeNode, Integer> map = new HashMap<>();

        if(root != null){
            st.add(root);
        }

        while(!st.isEmpty()){
            TreeNode node = st.peek();

            if(node.left != null && !map.containsKey(node.left)){
                st.push(node.left);
            } else if(node.right != null && !map.containsKey(node.right)){
                st.push(node.right);
            } else{
                st.pop();
                int left = map.getOrDefault(node.left, 0);
                int right = map.getOrDefault(node.right, 0);

                if(Math.abs(left - right) > 1){
                    return false;
                }

                map.put(node, 1 + Math.max(left, right));
            }
        }

        return true;
    }
}
