package Contests;
// class Node{
//     int data;
//     Node next;
//     Node(int data)
//     {
//         this.data=data;
//         this.next=null;
//     }
//     Node(int data,Node next)
//     {
//         this.data=data;
//         this.next=next;

//     }
// }

public class DetectCycle {
    public static boolean hasCycle(Node head) {
        while(head!=null ||head.next!=null)
        {
            return false;
        }
        Node fast=head;
        Node slow=head;
        while(fast!=null||fast.next!=null)
        {
            slow=head.next;
            fast=head.next.next;
        
            if(slow==fast)
            {
                return true;
            }
            // head=head.next;
        }
        
        return false;

    }
    public static void main(String[] args) {
        Node head=new Node(3);
        head.next=new Node(2);
        head.next.next=new Node(0);
        head.next.next.next=new Node(-4);
        int pos=-1;
        head.next.next.next.next=head.next;
     
       boolean asnwer=hasCycle(head);
       System.out.println(asnwer);
    }
    
}
