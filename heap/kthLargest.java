import java.util.PriorityQueue;

public class kthLargest{
    private int k;
    private PriorityQueue<Integer> minHeap;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(k);

        for(int num: nums){
            if(minHeap.size() < k){
                minHeap.offer(num);
            }
            else if(num > minHeap.peek()){
                minHeap.offer(num);
                if(minHeap.size() > k){
                    minHeap.poll();
                }
            }
        }
    }
    
    public int add(int val) {
        if(minHeap.size() < k){
            minHeap.offer(val);
        }
        else if(val > minHeap.peek()){
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}