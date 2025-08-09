/* Och1r1
Problem Description:

Daily Temperatures
You are given an array of integers temperatures where temperatures[i] 
represents the daily temperatures on the ith day.

Return an array result where result[i] is the number of days after 
the ith day before a warmer temperature appears on a future day. 
If there is no day in the future where a warmer temperature will appear for the ith day, set result[i] to 0 instead.

Example 1:

Input: temperatures = [30,38,30,36,35,40,28]

Output: [1,4,1,2,1,0,0]

First time knowing about what is monotonic stack from this problem ;DD
 */
import java.util.Arrays;
import java.util.Stack;

public class dailyTemp {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[temperatures.length];

        for(int i = temperatures.length - 1; i >= 0; i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                res[i] = st.peek() - i;
            }

            st.push(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = {30,38,30,36,35,40,28};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
