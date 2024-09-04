package LL;

public class InsHead {
    public static Node1 insertHead(Node1 head)
    {
        Node1 newNode=new Node1(100);
        
        newNode.next=head;
        head=newNode;
        return head;
        // return new Node1(100,head);
    }
    public static void printList(Node1 head)
    {
        Node1 current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        int[]arrayyy={12,5,8,7};
        Node1 head=new Node1(arrayyy[0]);
        head.next=new Node1(arrayyy[1]);
        head.next.next=new Node1(arrayyy[2]);
        head.next.next.next=new Node1(arrayyy[3]);
        head=insertHead(head);
        printList(head);
    }
    
}
