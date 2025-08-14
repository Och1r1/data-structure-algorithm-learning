/* Och1r1
Problem Description:

Given the beginning of a singly linked list head, 
reverse the list, and return the new beginning of the list.

Oh god i hate linkedlist so much, i had so much problem with easy linkedlist problem :((

Example 1:

Input: head = [0,1,2,3]

Output: [3,2,1,0]
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}
