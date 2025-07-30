/* Och1r1
Max Product of Two Integers
How to find maximum product of two integers in the array where all elements are positive.
Example
int[] intArray = {10,20,30,40,50};
maxProduct(intArray) // (40,50)
*/

public class maxProduct {
    public static String maxProduct(int[] intArray) {
        int max = 0;
        int second_max = 0;
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] > max){
                second_max = max;
                max = intArray[i];
            }
            else if(intArray[i] > second_max){
                second_max = intArray[i];
            }
        }
        return max + "," + second_max;
    }

    public static void main(String[] args){
        int[] intArray = {10,20,30,40,50};
        System.out.println(maxProduct(intArray));    
    }
}
