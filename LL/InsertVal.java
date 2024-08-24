package LL;

public class InsertVal {
    public static void printList(Node1 head)
    {
        Node1 current1=head;
        while(current1!=null)
        {
            System.out.print(current1.data+" ");
            current1=current1.next;
        }
    }
    public static Node1 insertBeforeValue(Node1 head,int val,int x)
    {
        Node1 current2=head;
        if(head==null)
        {
            return null;
        }
        if(head.data==val)
        {
            return new Node1(x,head);
        }
        while(current2.next!=null)
        {
            if(current2.next.data==val)
            {
                Node1 newNode=new Node1(x);
                newNode.next=current2.next;
                current2.next=newNode;
                break;
            }
            current2=current2.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node1 head=new Node1(12);
        head.next=new Node1(13);
        head.next.next=new Node1(14);
        head.next.next.next=new Node1(16);
        int element=12;
        int fixData=8;
        insertBeforeValue(head,element,fixData);
        printList(head);


    }
    
}
