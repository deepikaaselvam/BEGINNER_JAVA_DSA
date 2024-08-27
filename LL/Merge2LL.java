package LL;

public class Merge2LL {//To sort in non-decreasing order
    public static void printList(Node result)
    {
        Node answer=result;
        while(answer!=null)
        {
            System.out.print(answer.data+" ");
            answer=answer.next;
        }

    }
    public static Node mergeTwoLinkedLists(Node h1,Node h2)
    {
        if(h1==null)
        {
            return h2;
        }
        if(h2==null)
        {
            return h1;
        }
        Node current1=h1;
        Node current2=h2;
        Node dummyNode=new Node(-1);
        Node moverDummyNode=dummyNode;
        while(current1!=null&&current2!=null)
        {
            if(current1.data<=current2.data)
            {
                moverDummyNode.next=current1;
                current1=current1.next;
            }
            else{
                moverDummyNode.next=current2;
                current2=current2.next;
               
               

            }
            moverDummyNode=moverDummyNode.next;
        
        }
        if(current1!=null)
        {
            moverDummyNode.next=current1;
        }
        if(current2!=null)
        {
            moverDummyNode.next=current2;
        }

        return dummyNode.next;

    }
    public static void main(String[] args) {
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
