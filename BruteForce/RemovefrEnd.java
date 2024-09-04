package BruteForce;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}
public class RemovefrEnd {
   
    public static Node removeNthNodefromEnd(Node head,int n)
    {
        Node currentOne=head;
        int cnt=0;
        while(currentOne!=null)
        {
            cnt++;
            currentOne=currentOne.next;
        }
        if(cnt==n)
        {
            
            Node newhead=head.next;
            head=null;
            return newhead;
        }
        
        int result=cnt-n;
        currentOne=head;
        while(currentOne!=null)
        {
            result--;
            if(result==0)
            {
                break;
            }
            currentOne=currentOne.next;
            
        }
     
        Node deleteOne=currentOne.next;
        currentOne.next=currentOne.next.next;
        deleteOne=null;

        return head;
    }
    public static void printList(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }

    }
    public static void main(String[] args) {
        int arr[]={12,5,8,7,6};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);

        printList(head);
        System.out.println();
        int N=5;
        removeNthNodefromEnd(head,N);
        printList(head);
    }
    
}
