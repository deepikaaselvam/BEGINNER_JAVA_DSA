package LL;

public class MidElement {
    public static Node  middleElementLL(Node head)
    {
        Node current=head;int length=0;
        while(current!=null)
        {
            length++;
            current=current.next;
        }
        int Middle=(length/2)+1;
        current=head;
        current=new Node(Middle);
        while(current!=null)
        {
            Middle=Middle-1;
            if(Middle==0)
            {
                break;
            }
            current=current.next;
        }
        return current;

    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(90);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
       Node middleElement=(middleElementLL(head));
       System.out.println(middleElement.data);
    }
    
}
