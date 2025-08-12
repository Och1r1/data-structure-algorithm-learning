/* Och1r1
Problem Description:

Valid Palindrome
Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. 
It is also case-insensitive and ignores all non-alphanumeric characters.

Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

Example 1:

Input: s = "Was it a car or a cat I saw?"

Output: true
 */

public class palindrome {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        char[] chars = s.toCharArray();

        while(left < right){
            if(!Character.isLetterOrDigit(chars[left])){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(chars[right])){
                right--;
                continue;
            }


            if(Character.toLowerCase(chars[left]) == Character.toLowerCase(chars[right])){
                left++;
                right--;
                continue;
            } else{
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
    }
}
