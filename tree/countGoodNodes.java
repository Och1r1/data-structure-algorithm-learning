
/* even though i knew that i need to use recursion approach in here, i am very bad with recursion i tried iterative O(n) approach. But it was slow compared to recursive one. 
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;

public class countGoodNodes {
    public int goodNodes(TreeNode root) {
        HashMap<TreeNode, Integer> map = new HashMap<>();
        Queue<TreeNode> qu = new LinkedList<>();
        int counter = 0;

        if(root != null){
            qu.add(root);
        } else{
            return 0;
        }

        while(!qu.isEmpty()){
            TreeNode node = qu.poll();
            int a;
            if(!map.containsKey(node)){
                a = node.val;
            }
            else{
                a = map.get(node);
            }

            if(node.left != null && node.left.val >= a){
                counter++;
                qu.add(node.left);
            }
            else if(node.left != null && node.left.val < a){
                map.put(node.left, a);
                qu.add(node.left);
            }
            if(node.right != null && node.right.val >= a){
                counter++;
                qu.add(node.right);
            }
            else if(node.right != null && node.right.val < a){
                map.put(node.right, a);
                qu.add(node.right);
            }
        }

        
        return counter + 1;
    }
}
*/

public class countGoodNodes{
    int count = 0;
    int maxVal = Integer.MIN_VALUE;

    void helper(TreeNode node){
        // recursive function bichihde base case ees ehelne! sugra
        if(node == null) return;

        int oldMax = maxVal;
        maxVal = Math.max(node.val, maxVal);

        if(node.val == maxVal) count++;

        helper(node.left);
        helper(node.right);

        maxVal = oldMax;
    }


    public int goodNodes(TreeNode root){
        helper(root);
        return count;
    }
}