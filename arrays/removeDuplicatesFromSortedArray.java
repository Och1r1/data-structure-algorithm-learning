/* Och1r1
Problem Description:

Remove Duplicates from Sorted Array - LeetCode 26
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
Example:
Input: nums = [1, 1, 2] 
Output: 2
*/

public class removeDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int comp = nums[0];
        int counter = 1;

        for(int i = 1; i < nums.length; i++){
            if(comp != nums[i]){
                comp = nums[i];
                counter++;
            }
        }
        
        return counter;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 3, 5, 5, 6};
        System.out.println(removeDuplicates(nums));
    }
}