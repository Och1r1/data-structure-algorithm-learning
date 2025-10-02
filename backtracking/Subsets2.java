import java.util.*;

public class Subsets2 {
    public static List<List<Integer>> subsetsWithDup(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        backtracking(0, nums, new ArrayList<>(), result);


        return result;
    }

    private static void backtracking(int index, int[] nums, List<Integer> subset, List<List<Integer>> result){
        result.add(new ArrayList<>(subset));

        for(int i = index; i < nums.length; i++){
            if(i > index && nums[i] == nums[i - 1]){
                continue;
            }
            subset.add(nums[i]);
            backtracking(i + 1, nums, subset, result);
            subset.remove(subset.size() - 1);
        }
    }
}
