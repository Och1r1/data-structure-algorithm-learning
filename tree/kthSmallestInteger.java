import java.util.ArrayList;

public class kthSmallestInteger {
    public static int kthSmallest(TreeNode root, int k){
        ArrayList<Integer> ls = new ArrayList<>();
        helper(root, ls);

        return ls.get(k - 1);
    }

    public static void helper(TreeNode node, ArrayList<Integer> ls){
        if(node == null) return;

        helper(node.left, ls);
        ls.add(node.val);
        helper(node.right, ls);
    }
}
