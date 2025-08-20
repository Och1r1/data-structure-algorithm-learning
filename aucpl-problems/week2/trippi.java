/*
7
united states america
oh my god
i cant lie
binary indexed tree
believe in yourself
skibidi slay sigma
god bless america
 */
import java.util.Scanner;

public class trippi {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int num = Integer.parseInt(scnr.nextLine());
        for(int i = 0; i < num; i++){
            String word = scnr.nextLine();
            String[] words = word.split(" ");
            String res_word = "";
            for(String w: words){
                char[] chars = w.toCharArray();
                res_word += chars[0];
            }
            System.out.println(res_word);
        }
        scnr.close();
    }
}
