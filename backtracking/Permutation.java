import java.util.*;

public class Permutation{
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        boolean[] visited = new boolean[length];

        backtracking(visited, nums, length, result, new ArrayList<>());

        return result;
    }    

    private static void backtracking(boolean[] visited, int[] nums, int length, List<List<Integer>> result, List<Integer> subset){
        if(subset.size() == length){
            result.add(new ArrayList<>(subset));
        }
        
        for(int i = 0; i < length; i++){
            if(!visited[i]){
                subset.add(nums[i]);
                visited[i] = true;
                backtracking(visited, nums, length, result, subset);
                subset.remove(subset.size() - 1);
                visited[i] = false;
            }
        }
    }
}

/*
import java.util.*;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int num: nums){
            hs.add(num);
        }
        
        backtracking(hs, nums.length, subset, result, nums);

        return result;
    }

    private static void backtracking(HashSet<Integer> hs, int length, List<Integer> subset, List<List<Integer>> result, int[] nums){
        if(subset.size() == length){
            result.add(new ArrayList<>(subset));
            return;
        }

        for(int i = 0; i < length; i++){
            if(hs.contains(nums[i])){
                subset.add(nums[i]);
                hs.remove(nums[i]);
                backtracking(hs, length, subset, result, nums);
                subset.remove(subset.size() - 1);
            }
        }
    }
}*/
