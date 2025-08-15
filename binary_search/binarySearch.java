/* Och1r1
Problem Description:

Given an array of integers nums which is sorted in ascending order, 
and an integer target, write a function to search target in nums. 
If target exists, then return its index. Otherwise, return -1.

 */

public class binarySearch {
    public static int search(int[] nums, int target) {
        int lower = 0;
        int higher = nums.length - 1;

        while(lower <= higher){
            int middle = (lower + higher) / 2;

            if(nums[middle] < target){
                lower = middle + 1;
            }else if(nums[middle] > target){
                higher = middle - 1;
            } else{
                return middle;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 2));

    }
}
