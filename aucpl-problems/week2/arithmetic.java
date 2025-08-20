/*
 * 
4
3
1 1 1
2
1 2
4
8 4 6 2
1
-2
 */

import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int cases = Integer.parseInt(scnr.nextLine());
        for(int i = 0; i < cases; i++){
            int length = Integer.parseInt(scnr.nextLine());
            int[] nums = new int[length];
            String num = scnr.nextLine();
            String[] num_string = num.split(" ");
            for(int j = 0; j < length; j++){
                nums[j] = Integer.parseInt(num_string[j]);
            }
            
            int sum = 0;
            for(int n: nums){
                sum += n;
            }
            if(sum < length){
                System.out.println(1);
            }
            else{
                if(sum > 0){
                    System.out.println(sum - length);
                }
                else if(sum == 0){
                    if(length == 0){
                        System.out.println(2);
                    }
                    else{
                        System.out.println(0);
                    }
                }
                else{
                    System.out.println(1);
                }
            }
        }
        scnr.close();
    }
}
