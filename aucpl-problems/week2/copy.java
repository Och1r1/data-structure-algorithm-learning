/*
2
3
3 2 1
6
3 1 4 1 5 9
 */

import java.util.HashSet;
import java.util.Scanner;

public class copy {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int cases = Integer.parseInt(scnr.nextLine());
        for(int i = 0; i < cases; i++){
            HashSet<Integer> set = new HashSet<>();
            int length = Integer.parseInt(scnr.nextLine());
            String num = scnr.nextLine();
            String[] num_string = num.split(" ");
            for(int j = 0; j < length; j++){
                set.add(Integer.parseInt(num_string[j]));
            }
            System.out.println(set.size());
        }

        scnr.close();
    }
}
