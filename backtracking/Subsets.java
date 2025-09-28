import java.util.*;

public class Subsets{
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        backtracking(0, nums, result, subset);
        return result;
    }

    private static void backtracking(int index, int[] nums, List<List<Integer>> res, List<Integer> ss){
        if(index == nums.length){
            res.add(new ArrayList<>(ss));
            return;
        }

        ss.add(nums[index]);
        backtracking(index + 1, nums, res, ss);

        ss.remove(ss.size() - 1);
        backtracking(index + 1, nums, res, ss);
    }
}