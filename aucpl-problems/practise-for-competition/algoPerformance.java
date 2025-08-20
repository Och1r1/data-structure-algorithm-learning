import java.util.*;

public class algoPerformance{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int count = scnr.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = scnr.nextInt();
        }

        Arrays.sort(nums);
        System.out.println(nums[0]);

        scnr.close();
    }
}