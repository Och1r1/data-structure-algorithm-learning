import java.util.*;

public class Cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // 1-, 2-, 3
        Arrays.sort(s); // 1-, 1-

        int g_pointer = 0, s_pointer = 0;
        while(g_pointer < g.length && s_pointer < s.length){
            if(s[s_pointer] >= g[g_pointer]){
                g_pointer++;
            }
            s_pointer++;
        }
        
        return g_pointer;
    }
}


// g -> 1 5 7 8 huuhed
// s -> 1 3 5 7 cookie