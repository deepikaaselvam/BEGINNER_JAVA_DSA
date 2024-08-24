package LL;

public class InsertPos {
    public static void printList(Node1 head)
    {
        Node1 temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }
    public static Node1 insertatthePosition(Node1 head,int ele,int position)
    {
       
        
        Node1 current=head;
        int cnt=0;
        while(current!=null)
        {
            if(head==null)
            {
                if(position==1)
                {
                    return new Node1(ele);
                }
                else
                {
                    return head;
                }
            } 
            if(position==1)
            {
                return new Node1(ele,head);}
           
            cnt++;
           if(cnt==position-1)
            {
                Node1 newNode=new Node1(384);// (or)straight way do like this also
                newNode.next=current.next;//as for these 2 line (Node1 newNode=new Node1(384,current.next))
                current.next=newNode;
            }
            current=current.next;
        }
        return head;
       
    }
    public static void main(String[] args) {
        Node1 head=new Node1(2);
        head.next=new Node1(5);
        head.next.next=new Node1(13);
        head.next.next.next=new Node1(34);
        int element=384;
        int k=1;
        insertatthePosition(head,element,k);
        printList(head);
    }
    
}
