/* Och1r1
Problem Description:

Middle Function
Write a function called middle 
that takes an array and returns a new array 
that contains all but the first and last elements.
myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3].
*/

import java.util.*;

public class middleFunction {
    public static int[] middle(int[] array) {
        ArrayList<Integer> new_arr = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if(i == 0 || i == array.length - 1){
                continue;
            }
            new_arr.add(array[i]);
        }

        int[] new_arr_converted = new int[new_arr.size()];

        for(int i = 0; i < new_arr.size(); i++){
            new_arr_converted[i] = new_arr.get(i);
        }

        return new_arr_converted;
    }

    public static void main(String[] args){
        int[] arr = {3, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(middle(arr)));
    }
}