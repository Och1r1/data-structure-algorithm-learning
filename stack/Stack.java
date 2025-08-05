/*
Problem Description:

Implement Stack
Implement a Stack class. The class should be initialized with a given value which would be the value of the first node in the stack. Specifications: Inner Node Class: Attributes: value: An integer that stores the value of the node. next: A Node type that points to the next node in the stack.
Stack class: Should accept an integer value to initialize the value attribute. Stack Class: Attributes: top: A private Node type that points to the top node of the stack. height: A private integer that keeps track of the number of elements in the stack. Constructor: Accepts an integer value as the initial value for the stack. Initializes the top with a new Node containing the given value. Sets the height to 1.
Push Method
Develop a method named push to place a new node with a specified value at the peak of the stack.
Return type: void

Pop Method
Develop a method named pop for a stack that executes the following
 */

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class Stack {
    private Node peak;
    private int length;

    public Stack() {
        this.peak = null;
        this.length = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = peak;
        peak = newNode;
        
        length++;
    }
    
    public Node pop() {
        if(length == 0){
            return null;
        }

        Node temp = peak;
        peak = peak.next;
        temp.next = null;

        length--;

        return temp;
    }

    // For demonstration purposes
    public int getPeakValue() {
        if (peak != null) {
            return peak.value;
        }
        return -1; // Return a dummy value if the stack is empty
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(16);
        stack.push(17);
        stack.push(18);

        stack.pop();

        System.out.println(stack.getPeakValue());  // Outputs: 10
    }

    
}
