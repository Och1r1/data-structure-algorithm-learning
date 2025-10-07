import java.util.HashMap;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        int count = 0;
        for(char c: s.toCharArray()){
            if(map.getOrDefault(c, false)){
                map.remove(c);
                count += 2;
            }
            else{
                map.put(c, true);
            }
        }
        if(s.length() - count >= 1){
            count += 1;
        }
        return count;
    }
}
