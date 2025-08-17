/* Och1r1
Problem Description:

Search a 2D Matrix
You are given an m x n 2-D integer array matrix and an integer target.

Each row in matrix is sorted in non-decreasing order.
The first integer of every row is greater than the last integer of the previous row.
Return true if target exists within matrix or false otherwise.

Can you write a solution that runs in O(log(m * n)) time?
 */

public class searchTwoD {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int innerLeft = 0;
        int innerRight = matrix[0].length - 1;

        while(left <= right){
            int mid = (int) Math.floor((left + right) / 2);
            System.out.println("MID: " + mid);
            if(matrix[mid][0] <= target && matrix[mid][matrix[0].length - 1] >= target){
                while(innerLeft <= innerRight){
                    int innerMid = (innerLeft + innerRight) / 2;
                    if(matrix[mid][innerMid] == target){
                        return true;
                    }
                    else if(matrix[mid][innerMid] < target){
                        innerLeft = innerMid + 1;
                        System.out.println("i am loopin here for 31");
                    } else{
                        innerRight = innerMid - 1;
                        System.out.println("i am loopin here for 34");
                    }
                }
                break;
            }
            else if(matrix[mid][0] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }

        }
        
        return false;
    }
    
    public static void main(String[] args){
        int[][] matrix = {{1}};
        System.out.println(searchMatrix(matrix, 2));
    }
}
