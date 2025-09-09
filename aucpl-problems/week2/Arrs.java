import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Arrs {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int cases = Integer.parseInt(scnr.nextLine());
        for(int i = 0; i < cases; i++){
            int length = Integer.parseInt(scnr.nextLine());
            ArrayList<Integer> nums = new ArrayList<>();
            ArrayList<Integer> holder = new ArrayList<>();
            String num = scnr.nextLine();
            String[] num_string = num.split(" ");
            for(int j = 0; j < length; j++){
                nums.add(Integer.parseInt(num_string[j]));
            }

            for(int m = 0; m < nums.size(); m++){
                holder.add(nums.get(m));
            }
            Collections.sort(holder);
            if(Arrays.equals(nums.toArray(), holder.toArray())){
                System.out.println("YES");
                continue;
            }
            
            while(true){
                for(int k = 0; k < nums.size() - 1; i++){
                    if(nums.get(k) <= nums.get(k+1)){
                        continue;
                    }
                    else{
                        int dissamble = nums.get(k);
                        int negj = dissamble % 10;
                        int aravt = (dissamble - negj) / 10;

                        nums.set(k, aravt);
                        nums.add(k+1, negj);
                    }
                    System.out.println("i am looping here forever");
                }
                if(Arrays.equals(nums.toArray(), holder.toArray())){
                    System.out.println("NO");
                    break;
                }

                for(int m = 0; m < nums.size(); m++){
                    holder.add(nums.get(m));
                }
                Collections.sort(holder);
                if(Arrays.equals(nums.toArray(), holder.toArray())){
                    System.out.println("YES");
                    break;
                }
                
                System.out.println("i am looping in while here forever");
            }
        }
        scnr.close();
    }
}