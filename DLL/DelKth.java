package DLL;


//Error Present in the Code

// import DLL.DelHead;

public class DelKth {
    public static DLLNode  deleteHeadNode(DLLNode head)
    {
        if (head == null) {
            return null; // If the list is empty, there's nothing to delete
        }
        if (head.next == null) { 
            return null; // If there's only one element, return null after deleting it
        }


        DLLNode current=head;
        head=head.next;
        head.prev=null;
        current.next=null;
       
       
        return head;
    }
    public static DLLNode deleteTailNode(DLLNode head)
    {
        if (head == null) {
            return null; // If the list is empty, there's nothing to delete
        }
        if (head.next == null) { 
            return null; // If there's only one element, return null after deleting it
        }
        DLLNode current=head;
        while(current.next!=null)
        {
            
            current=current.next;
        }
        DLLNode newTail=current.prev;
        if(newTail!=null)
        {
            newTail.next=null;
        }
        current.prev=null;
        return head;
    }
    public static DLLNode delKthElement(DLLNode head,int position)
    {
        if(head==null)
        {
            return null;

        }
        DLLNode curr=head;
        int cnt=0;
        while(curr!=null)
        {
            cnt++;
            if(cnt==position)
            {
                break;
            }
            curr=curr.next;
        }
        DLLNode beforeK=curr.prev;//storing the Before Node to the currentNode
        DLLNode afterK=curr.next;//storing the After Node to the currentNode
        if(beforeK==null && afterK==null)
        {
            return null;
        }
        else if(beforeK==null)
        {
            return  deleteHeadNode(head);
           
        }
        else if(afterK==null)
        {
            return deleteTailNode(head);
        }
        beforeK.next=afterK;
        afterK.prev=beforeK;
        curr.next=null;
        curr.prev=null;


        return head;
    }
    public static void main(String[] args) {
        DLLNode head=new DLLNode(2);
        head.next=new DLLNode(13);
        head.next.next=new DLLNode(1);
        head.next.next.next=new DLLNode(89);
        int k=3;
        head=delKthElement(head,k);
        head=deleteHeadNode(head);
        head=deleteTailNode(head);
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }

    }
    
}
