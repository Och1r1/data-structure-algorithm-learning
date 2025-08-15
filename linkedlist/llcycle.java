public class llcycle {
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
}
