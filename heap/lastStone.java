import java.util.PriorityQueue;

public class lastStone {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int stone: stones){
            pq.offer(stone);
        }

        while(!pq.isEmpty()){
            if(pq.size() == 1){
                return pq.poll();
            }
            int max = pq.poll();
            int second = pq.poll();
            if(max - second > 0){
                pq.add(max - second);
            }
        }

        return 0;
    }

    public static void main(String[] args){
        int[] ls = {2, 3, 63, 2, 4};
        System.out.println(lastStoneWeight(ls));
    }
}
