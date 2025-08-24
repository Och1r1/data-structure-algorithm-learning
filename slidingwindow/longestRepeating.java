/*
You are given a string s and an integer k. You can choose any character of the 
string and change it to any other uppercase English character. 
You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you 
can get after performing the above operations.
 */

public class longestRepeating {
    public static int characterReplacement(String s, int k) {
        int left = 0;
        int maxCount = 0;
        int[] freq = new int[26];
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            int windowLength = right - left + 1;

            if(windowLength - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            windowLength = right - left + 1;
            maxCount = Math.max(maxCount, windowLength);
        }
        
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }
}
