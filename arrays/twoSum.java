/* Och1r1
Problem Description:
Very famous problem, and i even remember the solution lmao

Two Sum - LeetCode 1
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
Examples
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]

Input: nums = [3,2,4], target = 6
Output: [1,2]
*/
import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //first integer would contain target-nums, next would contain index
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            else{
                map.put(target - nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
