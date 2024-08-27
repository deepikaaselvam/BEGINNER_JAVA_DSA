package DLL;

public class DLLNode {
    int data;
    DLLNode prev;
    DLLNode next;
    public DLLNode(int data) {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
    public DLLNode(int data,DLLNode prev,DLLNode next)
    {
        this.data=data;
        this.prev=prev;
        this.next=next;
    }
    
}
