package DLL;

public class DelTail {
    public static void deleteTailNode(DLLNode head)
    {
        DLLNode current=head;
        while(current.next!=null)
        {
            System.out.print(current.data+"  ");
            current=current.next;
        }
        DLLNode newTail=current.prev;
        newTail.next=null;
        current.prev=null;
    }
    public static void main(String[] args) {
        DLLNode head=new DLLNode(2);
        head.next=new DLLNode(3);
        head.next.next=new DLLNode(4);
        head.next.next.next=new DLLNode(5);
        deleteTailNode(head);
    }
    
}
