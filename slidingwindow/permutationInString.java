/*
This problem was much more easier than i thought, after i have been solving for
dynamic sliding window, i did not have any clue on this one because i am lacking
experience on fixed sliding window which is easier than I thought. I was just overthinking, overcomplicating by myself.
But u know, if u have dynamic size, then think more easy way. I think i am learning and learning more.
Sorry for yapping too much. Here is the problem description:

Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.
 */

import java.util.Arrays;

public class permutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();

        if(s2Length < s1Length || s2Length == 0){
            return false;
        }
        if(s1Length == 0){
            return true;
        }
        
        int[] ls1 = new int[26];
        int[] ls2 = new int[26];

        for(int i = 0; i < s1Length; i++){
            ls1[s1.charAt(i) - 'a']++;
            ls2[s2.charAt(i) - 'a']++;
        }

        for(int k = s1Length; k < s2Length; k++){
            if(Arrays.equals(ls1, ls2)){
                return true;
            }

            ls2[s2.charAt(k - s1Length) - 'a']--;
            ls2[s2.charAt(k) - 'a']++;
        }

        if(Arrays.equals(ls1, ls2)){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }
}
