/* Och1r1
Problem Description:

Missing Number
Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
Example
myArray = {1,2,3,4,6}
findMissingNumberInArray(myArray, 6) // 5
Hint:
Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.
*/

public class missingNumber {
    static int findMissingNumberInArray(int[] arr) {
        int len = arr.length + 1;
        int sum = len * (len + 1) / 2;

        for(int i = 0; i < arr.length; i++){
            sum -= arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] myArray = {1,2,4,5,6};
        System.out.println(findMissingNumberInArray(myArray));
    }
}