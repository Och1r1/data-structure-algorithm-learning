/* Och1r1
Problem Description:

You are given an array of non-negative integers height which 
represent an elevation map. Each value height[i] represents 
the height of a bar, which has a width of 1.

Return the maximum area of water that can be trapped between the bars.

Example 1:
Input: height = [0,2,0,3,1,0,1,3,2,1]

Output: 9
 */

public class trappingRainWater {
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int res = 0;

        while(left <= right){
            if(leftMax >= rightMax){
                int a = height[right];
                if(a >= rightMax){
                    rightMax = a;
                } else{
                    res += rightMax - a;
                }
                right--;
            }else{
                int b = height[left];
                if(b >= leftMax){
                    leftMax = b;
                } else{
                    res += leftMax - b;
                }
                left++;
            }
        }
        return res;
    }
}
