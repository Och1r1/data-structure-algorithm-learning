import java.util.Scanner;

public class haunted {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int cases = Integer.parseInt(scnr.nextLine());

        for(int t = 0; t < cases; t++){
            int n = Integer.parseInt(scnr.nextLine());
            String s = scnr.nextLine();

            // Store positions of zeros
            int[] zeros = new int[n];
            int zeroCount = 0;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '0'){
                    zeros[zeroCount] = i;
                    zeroCount++;
                }
            }

            // For each i from 1 to n
            for(int i = 1; i <= n; i++){
                if(zeroCount < i){
                    System.out.print("-1 ");
                } else {
                    int swaps = 0;
                    // Calculate swaps needed to move last i zeros to last i positions
                    for(int j = 0; j < i; j++){
                        swaps += (n - i + j) - zeros[zeroCount - i + j];
                    }
                    System.out.print(swaps + " ");
                }
            }
            System.out.println();
        }

        scnr.close();
    }
}
