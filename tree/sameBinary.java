/*
for some reason it beats runtime in 100% in leetcode. i thought my code would run slow
even though it is o(n), but i wrote so many if else statement.
 */

import java.util.Stack;

public class sameBinary {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        else if((p == null && q != null) || (p != null && q == null)){
            return false;
        }
        Stack<TreeNode> st = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st.add(p);
        st2.add(q);
        while(!st.isEmpty()){
            TreeNode current1 = st.pop();
            TreeNode current2 = st2.pop();

            if(current1.val != current2.val){
                return false;
            }
            TreeNode leftChild = current1.left;
            TreeNode rleftChild = current2.left;
            TreeNode rightChild = current1.right;
            TreeNode rrightChild = current2.right;



            if(leftChild != null && rleftChild != null){
                st.add(leftChild);
                st2.add(rleftChild);
            } else if( leftChild == null && rleftChild != null){
                return false;
            } else if (leftChild != null && rleftChild == null){
                return false;
            }
            
            if(rightChild != null && rrightChild != null){
                st.add(rightChild);
                st2.add(rrightChild);
            } else if( rightChild == null && rrightChild != null){
                return false;
            } else if (rightChild != null && rrightChild == null){
                return false;
            }
        }



        return true;
    }
}
