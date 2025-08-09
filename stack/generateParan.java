/* Och1r1
Problem Description:

Generate Parentheses
You are given an integer n. Return all well-formed parentheses strings that you can generate with n pairs of parentheses.

Example 1:

Input: n = 1

Output: ["()"]
Example 2:

Input: n = 3

Output: ["((()))","(()())","(())()","()(())","()()()"]

For me, using stack here was more difficult, so i approached this problem with recursion.
 */

import java.util.List;
import java.util.ArrayList;

public class generateParan {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(0, 0, "", res, n);

        return res;
    }

    public void dfs(int opening, int closing, String s, List<String> res, int n){
        if(opening == closing && (opening + closing) == 2 * n){
            res.add(s);
            return;
        }

        if(opening < n){
            dfs(opening + 1, closing, s + "(", res, n);
        }

        if(closing < opening){
            dfs(opening, closing + 1, s + ")", res, n);
        }
    }
}
