import java.util.ArrayList;
import java.util.Scanner;

public class mahmoudTriangle {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int length = Integer.parseInt(scnr.nextLine());
        ArrayList<Integer> nums = new ArrayList<>();
        String num = scnr.nextLine();
        String[] num_string = num.split(" ");
        for(int j = 0; j < length; j++){
            nums.add(Integer.parseInt(num_string[j]));
        }
        boolean found = false;

        int min = Math.abs(nums.get(0) - nums.get(1));
        int a = 0;
        int b = 1;
        for(int i = 0; i < nums.size(); i++){
            for(int j = 0; j < nums.size(); j++){
                if(i == j){
                    continue;
                }
                int compare = Math.abs(nums.get(i) - nums.get(j));
                if(compare <= min){
                    min = compare;
                    if(nums.get(a) < nums.get(i)){
                        a = i;
                        b = j;
                    }
                }
            }
        }

        for(int k = 0; k < nums.size(); k++){
            if(k == a || k == b){
                continue;
            }
            if(nums.get(k) > min && Math.abs((nums.get(a) + nums.get(b))) > nums.get(k) && Math.abs((nums.get(a) + nums.get(k))) > nums.get(b) && (Math.abs(nums.get(b) + nums.get(k))) > nums.get(a)){
                System.out.println("YES");
                System.out.println(nums.get(a) + " " + nums.get(b) + " " + nums.get(k));
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("NO");
        }
            
        scnr.close();
    }
}
