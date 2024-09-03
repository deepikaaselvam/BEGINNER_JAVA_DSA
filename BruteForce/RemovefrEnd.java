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
    public static Node convertArray2Ll(int[]arr)
    {
        Node head=new Node(arr[0]);
        Node current=head;
       for(int i=1;i<arr.length;i++)
        {
            Node temp=new Node(arr[i]);
            current.next=temp;
            current=temp;
        }
        return head;
    }
    public static Node removeNthNodefromEnd(Node head,int n)
    {
        Node currentOne=head;int cnt=0;
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
            else{
                currentOne=currentOne.next;
            }
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
        Node head=convertArray2Ll(arr);
        printList(head);
        System.out.println();
        int N=5;
        removeNthNodefromEnd(head,N);
        printList(head);
    }
    
}
