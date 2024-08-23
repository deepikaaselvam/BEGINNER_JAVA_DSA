package LL;

public class DelEl {
    public static Node1 delElementValue(Node1 head,int elements)
    {
        Node1 current=head;
        Node1 prev=null;
        while(current!=null){
            if(current.data==elements)
            {
                prev.next=prev.next.next;
                
            }
            
            prev=current;
            current=current.next;
            
        }

        return current;
    }
    public static void main(String[] args) {
        Node1 head=new Node1(12);
        head.next=new Node1(15);
        head.next.next=new Node1(13);
        head.next.next.next=new Node1(14);
        int element1=15;
        Node1 temp=head;
        delElementValue(temp,element1);
        while(temp!=null)
        {
            System.out.print(temp.data+" ");;
            temp=temp.next;
        }

    }
    
}
