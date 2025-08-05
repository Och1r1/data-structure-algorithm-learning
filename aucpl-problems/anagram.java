import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int a = Integer.parseInt(scnr.nextLine());
        HashSet<String> map = new HashSet<>();
        for(int i = 0; i < a; i++){
            String b = scnr.nextLine();
            char[] chars = b.toCharArray();
            Arrays.sort(chars);
            map.add(new String(chars));
        }
        System.out.println(map.size());
        scnr.close();
    }
}
