import java.util.*;

public class agarAdventure {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int current = Integer.parseInt(scnr.nextLine());
        int nums = Integer.parseInt(scnr.nextLine());
        String inp = scnr.nextLine();
        String[] inps = inp.split(" ");
        boolean asd = false;

        int[] parts = new int[nums];
        for(int i = 0; i < nums; i++){
            parts[i] = Integer.parseInt(inps[i]);
        }

        Arrays.sort(parts);
        for(int i = 0; i < nums; i++){
            if(i == nums-1){
                continue;
            }
            if(current + parts[i] < parts[i+1]){
                System.out.println("L Bozo.");
                asd = true;
            }
            current += parts[i];
        }
        
        if(!asd){
            System.out.println("Yes!");
        }
    }
}
