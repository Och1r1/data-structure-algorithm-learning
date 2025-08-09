import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            if(st.empty()){
                st.push(Integer.parseInt(tokens[i]));
            }
            else{
                if(isNumeric(tokens[i])){
                    st.push(Integer.parseInt(tokens[i]));
                }else{
                    int sec = st.pop();
                    int first = st.pop();
                    if(tokens[i].equals("+")){
                        first += sec;
                        st.push(first);
                    }else if(tokens[i].equals("*")){
                        first *= sec;
                        st.push(first);
                    }else if(tokens[i].equals("/")){
                        first /= sec;
                        st.push(first);
                    }else if(tokens[i].equals("-")){
                        first -= sec;
                        st.push(first);
                    }
                }
            }
        }             

        
        
        return st.peek();
    }

    public boolean isNumeric(String s){
        try{
            Double.parseDouble(s);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
