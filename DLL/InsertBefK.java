package DLL;
class DLLNode{
    int data;
    DLLNode next,prev;
    DLLNode(int data)
    {
        this.data=data;
        this.next=this.prev=null;
    }
    DLLNode (int data,DLLNode prev,DLLNode next)
    {
        this.data=data;
        this.prev=prev;
        this.next=next;
    }
}

public class InsertBefK {
    public static DLLNode  convertArray2LL(int[]arr)
    {
        DLLNode head=new DLLNode (arr[0]);
        DLLNode previous=head;
        for(int i=1;i<arr.length;i++)
        {
            DLLNode current=new DLLNode(arr[i]);
            previous.next=current;
            previous=current;
        }
        return head;

    }
    public static DLLNode BeforeKthNode(DLLNode head,int index,int value)
    {
        DLLNode current=head;
        int cnt=0;
       
        while(current!=null)
        {
            cnt++;
            if(cnt==index)
            {
               break;
            }
            current=current.next;
        }
        DLLNode previous=current.prev;
        DLLNode new_Node=new DLLNode(value,previous,current);
        previous.next=new_Node;
        current.prev=new_Node;
      
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
        int[]arrrayyy={12,5,8,7};
        DLLNode head=convertArray2LL(arrrayyy);
        printList(head);
        System.out.println();
        int k=3;
        int val=10;
        head=BeforeKthNode(head,k,val);
        printList(head);
    }
    
}
