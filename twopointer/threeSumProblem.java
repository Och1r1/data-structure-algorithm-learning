import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSumProblem {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> listOfLists = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates for i

            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    listOfLists.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // by this way, our array is sorted, so it wouldnt produce any duplicated 
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // skip duplicates for right
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return listOfLists;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> listOfLists = threeSum(nums);

        for (List<Integer> innerList : listOfLists) {
            System.out.println(innerList);
        }
    }
}
