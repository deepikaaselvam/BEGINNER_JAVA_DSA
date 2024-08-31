package DLL;

public class DelElement {
    public static DLLNode convertArr2LL(int[]a)
    {
        DLLNode head=new DLLNode(a[0]);
        DLLNode prev=head;
        for(int i=1;i<a.length;i++)
        {
            DLLNode current=new DLLNode(a[i]);
            prev.next=current;
            prev=current;
        }
        return head;

     

    }
    public static DLLNode delElementofTheNode(DLLNode head)
    {
        if(head==null ||head.next==null)
        {
            return head;
        }
        DLLNode curr=head;
        
        DLLNode BeforeValue=curr.prev;
        DLLNode AfterValue=curr.next;
        if(AfterValue==null)
        {
            BeforeValue.next=null;
            curr.prev=null;
            curr.next=null;
        }
        // else if(BeforeValue==null)
        // {
        //     AfterValue.prev=null;
        //     curr.prev=null;
        //     curr.next=null;

        // }
        BeforeValue.next=AfterValue;
        AfterValue.prev=BeforeValue;
        curr.prev=null;
        curr.next=null;
        return curr;
    }
    public static void main(String[] args) {
        int[]arr={12,5,8,7};
        DLLNode head1=convertArr2LL(arr);
        while(head1!=null)
        {
            System.out.print(head1.data+" ");
            head1=head1.next;
        }
         delElementofTheNode(head1.next);
         while(head1!=null)
         {
             System.out.print(head1.data+" ");
             head1=head1.next;
         }
         
    }
    
}
