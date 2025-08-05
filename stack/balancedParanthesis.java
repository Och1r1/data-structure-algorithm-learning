/* Och1r1
Problem Description:

Balanced Parentheses Checker
Given an expression string, write a Java program to check whether the parentheses in the expression are balanced or not. The types of parentheses to consider are curly {}, square [], and round ().
Hint: Using stacks for parsing and balancing symbols. 
 */

import java.util.Stack;
import java.util.HashMap;

public class balancedParanthesis {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        char[] chars = expression.toCharArray();

        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');


        for(char ch: chars){
            if(ch == ')' || ch == '}' || ch == ']'){
                // '(', '{', '['
                char c = stack.pop();
                if (ch == map.get(c)){
                    continue;
                }
                else{
                    return false;
                }

            }else{
                stack.push(ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String expression = "({[(]})";
        if(isBalanced(expression)){
            System.out.println("Balanced Hurray!");
        }
        else{
            System.out.println("Not balanced :((((");
        }
    }
}