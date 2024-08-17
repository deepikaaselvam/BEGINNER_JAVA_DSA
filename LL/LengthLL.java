package LL;
public class LengthLL {
    public static int printLength(Node head)
    {
        int cnt=0;
        Node current=head;
        while(current!=null)
        {
            
            current=current.next;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(10);
        head.next.next=new Node(15);
        head.next.next.next=new Node(20);
        System.out.println(printLength(head));

    }
    
}
