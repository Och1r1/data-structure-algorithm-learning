/*public class llcycle {
    public boolean hasCycle(ListNode head) {
        ListNode node = new ListNode(0);
        ListNode next = new ListNode();
        while(head != null){
            if(head.next == node){
                return true;
            }
            next = head.next;
            head.next = node;
            head = next;
        }   
        
        return false;
    }
}*/

// the above approach was my solution, and i was having problem with O(n) space problem
// so i decided to watch utube, and i found out about floyd's tortoise and hare



public class llcycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        
        return false;
    }
}