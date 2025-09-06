import java.util.LinkedList;

public class validBinarySearchTree {
    public static boolean isValidBST(TreeNode root) {
        LinkedList<Integer> inOrderList = new LinkedList<>();

        helper(root, inOrderList);
        int prev = inOrderList.get(0);

        for(int i = 1; i < inOrderList.size(); i++){
            int val = inOrderList.get(i);
            if(val <= prev){
                return false;
            }

            prev = val;
        }

        return true;
    }

    public static void helper(TreeNode node, LinkedList<Integer> list){
        if(node == null){
            return;
        }

        helper(node.left, list);
        list.add(node.val);
        helper(node.right, list);
    }
}
