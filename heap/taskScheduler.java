import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class taskScheduler {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: tasks){
            int current = map.getOrDefault(c, 0);
            map.put(c, current + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.addAll(map.values());

        int result = 0;
        while(!pq.isEmpty()){
            Queue<Integer> qu = new LinkedList<>();
            
            for(int i = 0; i < n + 1; i++){
                if(!pq.isEmpty()){
                    qu.add(pq.poll());
                }
            }

            for(int a: qu){
                if(a > 1){
                    a = a - 1;
                    pq.add(a);
                }
            }

            if(pq.isEmpty()){
                result += qu.size();
            }
            else{
                result += n + 1;
            }
        }
        return result;
    }
}
