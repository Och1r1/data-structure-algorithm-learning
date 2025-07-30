/* Och1r1
Problem Description:

IsUnique / Contains Duplicate - LeetCode 217
Write a program to check if an array is unique or not.
Example
int[] intArray = {1,2,3,4,5,6};
isUnique(intArray) // true
*/
import java.util.HashSet;

public class isUnique {
    public static boolean isUnique(int[] intArray) {
        HashSet<Integer> b = new HashSet<>();

        for(int num: intArray){
            if(!b.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] intArray = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(isUnique(intArray));
    }
}
