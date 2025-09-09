import java.util.Scanner;

public class sumOfThree {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int cases = Integer.parseInt(scnr.nextLine());
        for(int i = 0; i < cases; i++){
            int sum = Integer.parseInt(scnr.nextLine());
            int first = 1;
            int second = 2;
            int num = sum - first - second;
            boolean found = false;
            while(first < num && second < num){
                if(num % 3 != 0){
                    if(first == second || first == num || second == num){
                        continue;
                    }
                    System.out.println("YES");
                    System.out.println(first + " " + second + " " + num);
                    found = true;
                    break;
                }
                if(second % 3 == 2){
                    second = second + 2;
                }
                else if(second % 3 == 1){
                    first = first + 1;
                }
                num = sum - first - second;
            }
            if(!found) System.out.println("NO");
        }
        scnr.close();
    }
}
