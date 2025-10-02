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
}
