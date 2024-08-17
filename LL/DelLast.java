package LL;
class DelLast {
    private static Node1 deleteLastNode(Node1 head)
    {
        if(head==null||head.next==null)
        {
            return null;
        }
        Node1 current=head;
        while(current.next.next!=null)//1->2->3->4->null
        {
            System.out.print(current.data+" ");//"It will print the first 2 elements in the LinkedList"
            current=current.next;
        }

        return current;//it will print "before the last element"
    }
    public static void main(String[] args) {
        Node1 head=new Node1(1);
        head.next=new Node1(2);
        head.next.next=new Node1(3);
        head.next.next.next=new Node1(4);
        System.out.println(deleteLastNode(head));

    }
}