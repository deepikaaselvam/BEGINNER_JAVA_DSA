package LL;

public class OddEvenSeg {
    public static void printList(Node OddEven)
    {
        Node currentOne=OddEven;
        while(currentOne!=null)
        {
            System.out.print(currentOne.data+" ");
            currentOne=currentOne.next;
        }
        
      
    }
    public static Node OddorEvenSegragation(Node head)
    {
        Node curr=head;
        Node OddDummyNode=new Node(-1);
        Node EvenDummyNode=new Node(-1);
        Node oddNode=OddDummyNode;
        Node evenNode=EvenDummyNode;
        while(curr!=null)
        {
            if(curr.data%2==0)
            {
                evenNode.next=curr;
                evenNode=evenNode.next;
                
            }
            else{
                oddNode.next=curr;
                oddNode=oddNode.next;
                
            }
            curr=curr.next;
        }
        oddNode.next=null;///It will used to avoid the Cycle!!!!!
        evenNode.next=OddDummyNode.next;
        return EvenDummyNode.next;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        Node segragration=OddorEvenSegragation(head);
        printList(segragration);
    }
    
}
