import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ss = new ArrayList<>();
        backtracking(nums, target, res, ss, 0);

        return res;
    }

    private static void backtracking(int[] nums, int target, List<List<Integer>> result, List<Integer> subset, int start){
        if(target <= 0){
            if(target == 0){
                result.add(new ArrayList<>(subset));
            }
            return;
        }

        for(int i = start; i < nums.length; i++){
            subset.add(nums[i]);
            backtracking(nums, target - nums[i], result, subset, i);
            subset.remove(subset.size() - 1);
        }
        

    }
}
