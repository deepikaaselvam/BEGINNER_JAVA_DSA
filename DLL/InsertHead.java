package DLL;

public class InsertHead {
    public static DLLNode convertArraytoDLL(int[]arr)
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
    public static DLLNode insertHead(DLLNode head,int val)
    {
        DLLNode new_Node=new DLLNode(val,null,null);
        if(head==null)
        {
            return new_Node;
        }
         new_Node=new DLLNode(val,null,head);//this line All next and previousvalue is given   to the newNode
        head.prev=new_Node;
        new_Node.next=head;
        head=new_Node;
        return new_Node;

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
        DLLNode head=convertArraytoDLL(array);
        printList(head);
        System.out.println();
        head=insertHead(head,100);
        printList(head);

    }
    
}
