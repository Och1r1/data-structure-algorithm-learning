/* Och1r1
Problem Description:

Design a stack class that supports the push, pop, top, and getMin operations.

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
Each function should run in O(1) time.
 */
import java.util.Stack;

class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    public MinStack() {
    }
    
    public void push(int val) {
        st.push(val);
        if(minSt.isEmpty()){
            minSt.push(val);
        }
        else{
            minSt.push(Math.min(val, minSt.peek()));
        }
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
