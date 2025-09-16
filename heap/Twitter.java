import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class Twitter {
    HashMap<Integer, ArrayList<Integer>> map; // Twitter id -> post nuudiing id tai holbogdono.
    HashMap<Integer, HashSet<Integer>> follow;
    ArrayList<Integer> posts;

    public Twitter() {
        map = new HashMap<>();
        follow = new HashMap<>();
        posts = new ArrayList<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        if(map.containsKey(userId)){
            ArrayList<Integer> ls = map.get(userId);
            ls.add(tweetId);
        }
        else{
            ArrayList<Integer> ls = new ArrayList<>();
            ls.add(tweetId);
            map.put(userId, ls);
        }
        posts.add(tweetId);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(10, ((a, b) -> posts.indexOf(b) - posts.indexOf(a)));
        HashSet<Integer> ls = follow.getOrDefault(userId, new HashSet<>());
        for (int i : ls) {
            ArrayList<Integer> posts_person = map.get(i);
            if (posts_person != null) {
                pq.addAll(posts_person);
            }
        }


        if (map.containsKey(userId)) {
            pq.addAll(map.get(userId));
        }


        List<Integer> arr = new ArrayList<>();
        while(!pq.isEmpty() && arr.size() < 10){
            arr.add(pq.poll());
        }

        return arr;
    }
    
    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) return; // no self-follow

        HashSet<Integer> ls = follow.getOrDefault(followerId, new HashSet<>());
        ls.add(followeeId); // HashSet automatically avoids duplicates
        follow.put(followerId, ls);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followerId == followeeId) return;

        HashSet<Integer> ls = follow.get(followerId);
        if (ls != null) {
            ls.remove(followeeId);
        }
    }
}
