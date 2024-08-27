package DLL;

public class DelHead {
    public static DLLNode deleteHeadNode(DLLNode head)
    {
        DLLNode current=head;
        head=head.next;
        head.prev=null;
        current.next=null;
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }

        return current;


        

    }
    public static void main(String[] args) {
        DLLNode head=new DLLNode(2);
        head.next=new DLLNode(3);
        head.next.next=new DLLNode(4);
        head.next.next.next=new DLLNode(5);
        deleteHeadNode(head);
    }
    
}
