package LL;

public class InsertHead {
    public static Node1 insertFirst(Node1 head)
    {
        Node1 newNode=new Node1(12);
        newNode.next=head;
        System.out.println();
       System.out.println("\nAfter Inserting the Node\n");
    
        while(newNode!=null)
        {
            System.out.print(newNode.data+"  ");
            newNode=newNode.next;
        }
        return newNode;
    }
    public static Node1 insertFirst(Node1 head,int val)
    {
        Node1 newNode1=new Node1(val,head);
        System.out.println("After insert the node will be");
        while(newNode1!=null)
        {
            System.out.print(newNode1.data+"  ");
            newNode1=newNode1.next;
        }
        return newNode1;

    }
    public static void main(String[] args) {
        Node1 head=new Node1(13);
        head.next=new Node1(34);
        head.next.next=new Node1(45);
       
        System.out.println("\nBefore Insert the Head Node"+"\n");
        Node1 current=head;
          while(current!=null)
         {
            System.out.print(current.data+" ");
            current=current.next;
         }
         System.out.println();
         insertFirst(head,100);

        // insertFirst(head);
       
       
       
    }
    
}
