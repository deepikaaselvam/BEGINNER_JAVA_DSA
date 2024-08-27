package LL;

public class SlowandFast {
    public static Node slowandFastPointer(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null &&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(90);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(78);
        Node ans=slowandFastPointer(head);
        System.out.println(ans.data);

    }
    
}
