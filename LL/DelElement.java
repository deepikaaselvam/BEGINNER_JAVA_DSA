package LL;
public class DelElement {
    private static void deleteElement(Node1 head,int ele)
    {
        Node1 current=head;
        Node1 prev=null;
        if(current!=null && current.data==ele)
        {
           
            head=current.next;
            head=current;
        }
        
       while(current!=null)
       {
        if(current.data!=ele)
                prev=current;
                current=current.next;
       }
    if(current!=null)   //If some elements present but it is not equal to the deleted element,
                                //it means it is the deleted element!
    {
        prev.next=prev.next.next;
    }
           
        
}

    public static void main(String[] args) {
        Node1 head=new Node1(23);
        head.next=new Node1(24);
        head.next.next=new Node1(25);
        head.next.next.next=new Node1(26);
        head.next.next.next.next=new Node1(27);
        int element=23;
        Node1 temp=head;
        deleteElement(temp,element);
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    
}
