/* Och1r1
Problem Description: Leetcode 867

Given a 2D integer array matrix, 
return the transpose of matrix.

The transpose of a matrix is the matrix 
flipped over its main diagonal, 
switching the matrix's row and column indices.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Sursan zuil: matrix tai bodlogon deer 
ajillaj bga bol yg row column ii index bolj 
baigaa bilu yu bile nariin sain bodoh
*/

class Solution {
    public int[][] transpose(int[][] matrix) {
        int cols = matrix.length;
        int rows = matrix[0].length;
        int[][] transpose = new int[rows][cols];
        for(int i = 0; i < cols; i++){ // i -> column
            for(int j = 0; j<rows; j++){ // j -> row
                transpose[j][i] = matrix[i][j]; // end ingesneer column d bdag bsan too row ruu shiljij bn
            }
        }
        return transpose;
    }
}