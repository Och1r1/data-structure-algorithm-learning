/* Och1r1
Problem Description:

Two Integer Sum II
Given an array of integers numbers that is sorted in non-decreasing order.

Return the indices (1-indexed) of two numbers, [index1, index2], such that they add up to a given target number target and index1 < index2. Note that index1 and index2 cannot be equal, therefore you may not use the same element twice.

There will always be exactly one valid solution.

Your solution must use O(1), O(1) additional space.

Example 1:

Input: numbers = [1,2,3,4], target = 3

Output: [1,2]
 */

import java.util.Arrays;

public class twoInteger {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        
        while(left < right){
            int sum = numbers[left] + numbers[right];
            System.out.println("sum: " + sum);
            if(sum == target){
                return new int[] {numbers[left], numbers[right]};
            }else if(sum > target){
                right--;
                continue;
            }else{
                left++;
                continue;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ls = {1, 2, 3, 4};
        System.out.println(Arrays.toString(twoSum(ls, 3)));
    }
}
