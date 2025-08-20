/* Och1r1
Problem Description:

643. Maximum Average Subarray I
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
Any answer with a calculation error less than 10-5 will be accepted.

 */
/*  My solution, but was kind of hard to think whether where is my index, after watching tutorial,
    i got that i need two pointers and use while loop so i dont have to think about index out of bound or not.

public class maximumAve{
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        double max = sum;

        for(int j = 0; j <= nums.length - k - 1; j++){
            sum = sum - nums[j] + nums[j + k];
            if(sum > max){
                max = sum;
            }
        }

        return max / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(findMaxAverage(nums, k));
    }
} */

public class maximumAve{
    public double findMaxAverage(int[] nums, int k){
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        
        int startIndex = 0;
        int lastIndex = k;

        while(lastIndex < nums.length){
            sum -= nums[startIndex];
            startIndex++;

            sum += nums[lastIndex];
            lastIndex++;

            if(sum > maxSum){
                maxSum = sum;
            }
        }
        
        return (double) maxSum / k;
    }
}