package LL;
public class mergeLL{
    public static void printList(Node result)
    {
        Node answer=result;
        while(answer!=null)
        {
            System.out.print(answer.data+" ");
            answer=answer.next;
        }
    }

public static Node mergeTwoLinkedLists(Node h1, Node h2) {
    Node dummyNode = new Node(-1);
    Node moverDummyNode = dummyNode;

    while (h1 != null && h2 != null) {
        if (h1.data <= h2.data) {
            moverDummyNode.next = h1;
            h1 = h1.next;
        } else {
            moverDummyNode.next = h2;
            h2 = h2.next;
        }
        moverDummyNode = moverDummyNode.next;
    }

    // Attach the remaining part of both lists, if any
    if (h1 != null) {
        moverDummyNode.next = h1;
    }
    if (h2 != null) {
        moverDummyNode.next = h2;
    }

    return dummyNode.next;
}
public static void main(String[]args)
{
      //This is the First Node
      Node head1=new Node(1);
      head1.next=new Node(2);
      head1.next.next=new Node(3);
      head1.next.next.next=new Node(4);

      //This is the Second Node
      Node head2=new Node(1);
      head2.next=new Node(3);
      head2.next.next=new Node(4);
      head2.next.next.next=new Node(5);

      Node result=mergeTwoLinkedLists(head1,head2);
      printList(result);

}
}
