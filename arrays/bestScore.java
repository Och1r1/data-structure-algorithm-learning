/* Och1r1
Problem Description:

Best Score
Given an array, write a function to get first, second best scores from the array and return it in new array.
Array may contain duplicates.
Example
myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87}
 */

import java.util.*;

public class bestScore {
    public static int[] findTopTwoScores(int[] array){
        Arrays.sort(array);
        int[] top = new int[2];
        top[0] = array[array.length - 1];
        top[1] = array[array.length - 2];
    
        return top;
    }

    public static void main(String[] args){
        int[] arr = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores(arr)));
    }
}