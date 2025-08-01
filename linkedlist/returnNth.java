package linkedlist;
public class returnNth {
    public static void deleteDups(LinkedList ll, int num){
        Node current = ll.head;
        Node further = current;
        for(int i = 0; i < num-1; i++){
            further = further.next;
        }

        while(further.next!=null){
            current = current.next;
            further = further.next;
        }

        System.out.println(current.value);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(3); // duplicate
        ll.insertNode(4);
        ll.insertNode(5); // duplicate

        deleteDups(ll, 2);
    }
}
