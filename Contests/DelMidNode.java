package Contests;

public class DelMidNode {
    public static Node  convertArray2LL(int[]arr)
    {
        Node head=new Node (arr[0]);
        Node previous=head;
        for(int i=1;i<arr.length;i++)
        {
            Node current=new Node(arr[i]);
            previous.next=current;
            previous=current;
        }
        return head;
    }
    public static Node deleteMiddleNode(Node head)
    {
        if(head.next==null)
        {
            return null;
        }
        Node slow=head;
        Node fast=head;
        Node previous=null;
        while(fast!=null && fast.next!=null)
        {
            previous=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        previous.next=previous.next.next;
        return head;
    }
    public static void printList(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        int[]arr={1,3,4,7,1,2,6};
        Node head=convertArray2LL(arr);
        printList(head);
        System.out.println();
        System.out.println("Deleting the middle node will be");
        head=deleteMiddleNode(head);
        printList(head);
    }
    
}
