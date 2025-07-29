/* Och1r1
Problem Description:

Duplicate Number
Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)
Example
removeDuplicates({1, 1, 2, 2, 3, 4, 5})
Output : [1, 2, 3, 4, 5]
*/

import java.util.*;

public class duplicateNumber {
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (seen.add(num)) {
                result.add(num);
            }
        }

        int[] ls = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ls[i] = result.get(i);
        }

        return ls;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
