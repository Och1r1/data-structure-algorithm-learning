import java.util.Scanner;
import java.util.ArrayList;

public class cards {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int length = Integer.parseInt(scnr.nextLine());
        ArrayList<Integer> nums = new ArrayList<>();
        String num = scnr.nextLine();
        String[] num_string = num.split(" ");
        int sum = 0;
        for(int j = 0; j < length; j++){
            nums.add(Integer.parseInt(num_string[j]));
            sum += nums.get(j);
        }

        int each_sum = sum / (length / 2);

        for(int k = 0; k < length; k++){
            int pa = nums.get(k);
            if(pa != 0){
                int ir = each_sum - pa;
                for(int l = k + 1; l < length; l++){
                    if(ir == nums.get(l)){
                        nums.set(k, 0);
                        nums.set(l, 0);
                        System.out.println((k + 1) + " " + (l + 1));
                        break;
                    }
                }
            }
        }
            
        scnr.close();
    }
}
