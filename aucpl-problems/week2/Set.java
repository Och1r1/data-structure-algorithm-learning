import java.util.Scanner;

public class Set {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int cases = Integer.parseInt(scnr.nextLine());
        for(int i = 0; i < cases; i++){
            int[] nums = new int[3];
            String num = scnr.nextLine();
            String[] num_string = num.split(" ");
            for(int j = 0; j < 3; j++){
                nums[j] = Integer.parseInt(num_string[j]);
            }
            int lower_bound = nums[0];
            int maximum_bound = nums[1];
            int k = nums[2]; // boundary
            int counter = 0;
            int length = maximum_bound - lower_bound + 1;
            
            for(int l = lower_bound; l <= maximum_bound; l++){
                int result = length / l;

                if(((double) length / l) > result){
                    for(int m = 0; m < l - 1; m++){
                        if(((m + lower_bound) % l) == 0){
                            result++;
                            break;
                        }
                    }
                }
                if(result >= k){
                    System.out.println("result: " + result);
                    counter++;
                }
                
            }

            System.out.println(counter);
        }
        scnr.close();
    }
}
