import java.util.*;

public class letterHome {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int lines = Integer.parseInt(scnr.nextLine());
        for(int i = 0; i < lines; i++){
            String a_2 = scnr.nextLine();
            String[] nums_2 = a_2.split(" ");
            
            int size = Integer.parseInt(nums_2[0]);
            int current_position = Integer.parseInt(nums_2[1]);

            int[] ls = new int[size];
            String a = scnr.nextLine();
            String[] nums = a.split(" ");
            for(int j = 0; j < size; j++){
                ls[j] = Integer.parseInt(nums[j]);
            }

            int lowest = ls[0];
            int highest = ls[size - 1];

            if(current_position == highest || current_position == lowest){
                System.out.println(highest - lowest);
            }else{
                int steps = Math.abs(Math.min(current_position - lowest, highest - current_position));
                int other_steps = highest - lowest;

                steps += other_steps;
                System.out.println(steps);
            }
        }

        scnr.close();
    }
}
