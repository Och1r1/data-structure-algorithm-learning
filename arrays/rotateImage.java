/* Och1r1
Tip that i found useful from comment section of leetcode problem 48
90 = transpose + reverse row
180 = reverse row + reverse column
270 = transpose + reverse col
1 2 3 -> 1 4 7 -> 7 4 1 <-> 3 6 9
4 5 6 -> 2 5 8 -> 8 5 2 <-> 2 5 8
7 8 9 -> 3 6 9 -> 9 6 3 <-> 1 4 7
normal - transpose

Problem Description:
You are given an n x n 2D matrix representing an image, 
rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, 
which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation.
*/

import java.util.Arrays;

public class rotateImage {
    public static void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println(Arrays.deepToString(matrix));
        for(int i=0; i<rows; i++){ // i - row
            for(int j=i; j<cols; j++){ // j - column
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        for(int i=0; i<rows; i++){ // i - row
            for(int j=0; j<cols/2; j++){ // j - column
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cols-j-1];
                matrix[i][cols-j-1] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
    }
}