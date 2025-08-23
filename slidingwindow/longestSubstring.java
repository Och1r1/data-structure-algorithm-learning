// import java.util.*;

// public class longestSubstring {
//     public static int lengthOfLongestSubstring(String s) {
//         char[] char_array = s.toCharArray();
//         int maxCount = 0;
//         HashMap<Character, Integer> map = new HashMap<>();
//         int leftPointer = 0;
//         int rightPointer = 0;

//         for(int i = 0; i < char_array.length; i++){
//             char c = char_array[i];
//             if(map.containsKey(c)){
//                 leftPointer = Math.max(map.get(c) + 1, leftPointer);

//             }
//             map.put(c, i);
//             maxCount = Math.max(maxCount, rightPointer - leftPointer + 1);
//             rightPointer++;
//         }

//         return maxCount;
//     }

//     public static void main(String[] args) {
//         String s = "pwwkew";
//         System.out.println(lengthOfLongestSubstring(s));

//     }
// }
// this is my approach but mine wasnt fast. It runs in O(n) which is great but main 
// reasons why my approach is slow are: (by chatgpt)

// Why it might feel slow
// HashMap has constant time in theory, but there’s overhead: hashing, object allocation, boxing/unboxing of Character and Integer.
// For Java strings with only lowercase letters, you could optimize by using a fixed-size array of length 128 or 256 instead of a HashMap — this removes hashing overhead.

import java.util.*;

public class longestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        HashSet<Character> map = new HashSet<>();
        int leftPointer = 0;

        for(int rightPointer = 0; rightPointer < s.length(); rightPointer++){
            char c = s.charAt(rightPointer);
            while(map.contains(c)){
                map.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            map.add(c);
            maxCount = Math.max(maxCount, rightPointer - leftPointer + 1);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }
}