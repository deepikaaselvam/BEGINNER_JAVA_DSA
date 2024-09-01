package DLL;

class DLLNode {
    int data;
    DLLNode prev;
    DLLNode next;
    DLLNode(int data) {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
   DLLNode(int data,DLLNode prev,DLLNode next)
    {
        this.data=data;
        this.prev=prev;
        this.next=next;
    }
    
}
