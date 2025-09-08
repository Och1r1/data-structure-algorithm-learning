import java.util.*;

public class constructBinaryTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        
        return splitTree(preorder, map, 0, 0, inorder.length - 1);
    }

    public TreeNode splitTree(int[] preoder, HashMap<Integer, Integer> map, int rootIndex, int left, int right){
        TreeNode root = new TreeNode(preoder[rootIndex]);

        // create left and right subtree
        int mid = map.get(preoder[rootIndex]);

        if(mid > left)
            root.left = splitTree(preoder, map, rootIndex + 1, left, mid - 1);

        if(mid < right)
            root.right = splitTree(preoder, map, rootIndex + mid - left + 1, mid + 1, right);

        return root;
    }
}
