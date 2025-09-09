/*
5
10 5
7 9
5 100
1 1
1 2
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class lmao {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int cases = Integer.parseInt(scnr.nextLine());
        for(int i = 0; i < cases; i++){
            int[] nums = new int[2];
            String num = scnr.nextLine();
            String[] num_string = num.split(" ");
            for(int j = 0; j < 2; j++){
                nums[j] = Integer.parseInt(num_string[j]);
            }
            int coins = nums[0];
            int profitable = nums[1];
            
            if(coins * 2 <= profitable){
                System.out.println("0");
                continue;
            }
            
            // 3 5, 2 3, 1, 1
            for(int j = 0; j < coins; j++){
                if(coins >= profitable){
                    System.out.println(coins);
                    break;
                }
                coins--;
                profitable = profitable - 2;
                if(coins >= profitable){
                    System.out.println(coins);
                    break;
                }
            }
        }
        scnr.close();
    }
}
