/* Och1r1
Problem Description:

Remove Dups
Write a method to remove duplicates from an unsorted linked list.
Example
linkedList = 1->2->1->3
deleteDups(linkedList)
//Output
1->2->3

java -cp .. linkedlist.removeDups
*/

package linkedlist;

import java.util.HashSet;

public class removeDups {
    public static void deleteDups(LinkedList ll){
        HashSet<Integer> map = new HashSet<>();
        Node current = ll.head;
        Node prev = null;

        while(current!=null){
            int current_val = current.value;
            if(map.contains(current_val)){
                prev.next = current.next;
                ll.size--;
            }else{
                map.add(current_val);
                prev = current;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(1); // duplicate
        ll.insertNode(3);
        ll.insertNode(2); // duplicate
        System.out.print("Original: ");
        ll.traversalLL();
        System.out.println();

        deleteDups(ll);
        System.out.print("After removing duplicates: ");
        ll.traversalLL();
        System.out.println();
    }
}
