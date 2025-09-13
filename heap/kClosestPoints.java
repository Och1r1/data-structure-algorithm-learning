import java.util.PriorityQueue;

public class kClosestPoints {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((int[] a, int[] b) -> distSq(b) - distSq(a));

        for(int[] point: points){
            if(pq.size() < k){
                pq.add(point);
            }
            else{
                int[] max = pq.peek();
                if(distSq(max) - distSq(point) > 0){
                    pq.poll();
                    pq.add(point);
                }
            }
        }

        int[][] result = new int[k][];
        for(int i = 0; i < k; i++){
            result[i] = pq.poll();
        }
        return result;
    }

    private int distSq(int[] point) {
        return point[0]*point[0] + point[1]*point[1];
    }
}
