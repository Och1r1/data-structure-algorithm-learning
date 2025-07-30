/* Och1r1
Problem Description:

Finding a Number in an Array
Write a program to to check if an array contains a number in Java.
int[] intArray = {1,2,3,4,5,6};
searchInArray(intArray, 6); // 5
*/

public class findNumber {
    public static int searchInArray(int[] intArray, int valueToSearch) {
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] == valueToSearch){
                return i;
            }   
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6};
        int valueToSearch = 6;

        System.out.println(searchInArray(nums, valueToSearch));
    }
}