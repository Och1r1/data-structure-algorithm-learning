import java.util.Scanner;

public class fashionabLee {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int cases = Integer.parseInt(scnr.nextLine());
        for(int i = 0; i < cases; i++){
            int size = Integer.parseInt(scnr.nextLine());
            if(size % 4 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        scnr.close();
    }
}