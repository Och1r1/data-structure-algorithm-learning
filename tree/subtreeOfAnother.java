import java.lang.StringBuilder;

/*
public class subtreeOfAnother {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while (!qu.isEmpty()) {
            TreeNode cur = qu.poll();
            if (cur.val == subRoot.val && isSameTree(cur, subRoot)) {
                return true;
            }

            if (cur.left != null) qu.add(cur.left);
            if (cur.right != null) qu.add(cur.right);
        }

        return false;
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(p);
        q2.add(q);

        while (!q1.isEmpty()) {
            TreeNode cur1 = q1.poll();
            TreeNode cur2 = q2.poll();

            if (cur1 == null && cur2 == null) continue;
            if (cur1 == null || cur2 == null || cur1.val != cur2.val) return false;

            q1.add(cur1.left);
            q2.add(cur2.left);
            q1.add(cur1.right);
            q2.add(cur2.right);
        }
        return true;
    }
}
*/


// i thought it was fast :(D) but no.

public class subtreeOfAnother{
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String r = preOrderTraversal(root);
        String sr = preOrderTraversal(subRoot);

        return r.contains(sr);
    }

    public static String preOrderTraversal(TreeNode node){
        if(node == null){
            return null;
        }

        StringBuilder sb = new StringBuilder("^");
        sb.append(node.val);
        sb.append(preOrderTraversal(node.left));
        sb.append(preOrderTraversal(node.right));

        return sb.toString();
    }
}