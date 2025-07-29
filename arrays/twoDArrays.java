/* Och1r1
Problem Description:

2D Arrays
Given 2D array calculate the sum of diagonal elements.
Example
myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 
sumDiagonalElements(myArray2D) # 15
 */

public class twoDArrays{
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i == j){
                    sum += array[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumDiagonalElements(arr));
    }
}
