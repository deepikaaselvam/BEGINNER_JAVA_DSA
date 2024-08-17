package LL;
public class DelHead {
    private static Node1  array_2_LL(int[]arr){//Fully Converting the Array to the LL
        Node1 head=new Node1(arr[0]);// Step 1: Create the head of the linked 
        //list with the first element of the array.

        Node1 mover=head;//Initialize 'mover' to the head.
        for(int i=1;i<arr.length;i++)//Loop through the remaining elements of the array.
        {
            Node1 temp=new Node1(arr[i]);//Create a new node for each element.

            mover.next=temp;//Link the current node to the new node
            mover=temp;// Move 'mover' to the new node.


        }
        return head;//Return the head of the linked list.

    }
    private static  Node1 DeleteHeadNode(Node1 head)
        {
            if(head==null)
            {
                return  null;
            }
            head = head.next;
            Node1 current=head;
            while(current!=null)
            {
                System.out.print(current.data+ "-> ");
                current=current.next;
            }
            return null;
        }
    public static void main(String[] args) {
        
        int arrayvalue[]={12,5,6,7,8};
        Node1 head=array_2_LL(arrayvalue);
        System.out.println("Returning the head node :"+head);
        System.out.println("Deleting the first node will be");
        Node1 current=DeleteHeadNode(head);
        System.out.println(current);
    }
    
}
