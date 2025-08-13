/* Och1r1
Problem Description:

You are given an integer array heights where heights[i] represents 
the height of the ith bar.

You may choose any two bars to form a container. 
Return the maximum amount of water a container can store.
 */

public class containerWithMostWater {
    public static int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int max = 0;
        while(left < right){
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;

            max = Math.max(max, height * width);
            if(heights[left] > heights[right]){
                right--;
                continue;
            } else{
                left++;
                continue;
            }
        }


        return max;
    }

    public static void main(String[] args) {
        int[] heights = {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(heights));
    }
}
