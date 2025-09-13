import java.util.PriorityQueue;

public class kthMaxItem {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for(int num: nums){
            if(pq.size() < k){
                pq.add(num);
            }
            else{
                if(num > pq.peek()){
                    pq.remove();
                    pq.add(num);
                }
            }
        }
        return pq.remove();
    }
}
