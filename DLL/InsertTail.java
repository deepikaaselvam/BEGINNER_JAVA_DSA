package DLL;

public class InsertTail {
    public static DLLNode convertArray2LL(int[]arr)
    {
        DLLNode head=new DLLNode(arr[0]);
        DLLNode previous=head;
        for(int i=1;i<arr.length;i++)
        {
            DLLNode current=new DLLNode(arr[i]);
            previous.next=current;
            previous=current;
        }
        return head;
    }
    public static DLLNode insertatLast(DLLNode head,int val)
    {
        DLLNode Tail_Node =new DLLNode(val);
        DLLNode current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=Tail_Node;
        current=Tail_Node;
        return head;

    }
    public static DLLNode insertatBeforeTheTailNode(DLLNode head,int val1)
    {
        DLLNode Tail=head;

        while(Tail.next!=null)
        {
           Tail=Tail.next;
          
        }
        DLLNode previousNode=Tail.prev;
        DLLNode newBeforeTail=new DLLNode(val1,previousNode,Tail);
        previousNode.next=newBeforeTail;
        Tail.prev=newBeforeTail;
        return head;
    }
    public static void printList(DLLNode head)
    {
        DLLNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        int[]array={12,5,8,7};
        DLLNode head=convertArray2LL(array);
        printList(head);
        int value=1000;
        System.out.println();
        head=insertatLast(head,value);
        printList(head);
        System.out.println();
        head=insertatBeforeTheTailNode(head,value);
        printList(head);
    }
    
}
