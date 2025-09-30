import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        Arrays.sort(candidates);
        backtracking(result, subset, candidates, target, 0);

        return result;
    }

    private static void backtracking(List<List<Integer>> result, List<Integer> subset, int[] candidates, int target, int start){
        if(target <= 0){
            if(target == 0){
                result.add(new ArrayList<>(subset));
            }
            return;
        }

        for(int i = start; i < candidates.length; i++){
            if(i > start && candidates[i] == candidates[i - 1]){
                continue;
            }

            subset.add(candidates[i]);
            backtracking(result, subset, candidates, target - candidates[i], i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
