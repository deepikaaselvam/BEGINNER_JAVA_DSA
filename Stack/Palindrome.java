package Stack;
import java.util.Stack;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    Node (int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}
class Palindrome {
    public static boolean checkPalindrome(Node head)
    {
        Node curr=head;
        Stack<Integer>st=new Stack<>();
        while(curr!=null)
        {
            st.push(curr.data);
            curr=curr.next;
        }
        curr=head;
         while(curr!=null)
         {
            if(st.pop()!=curr.data)
            {
            
                return false;
            }
            curr=curr.next;

         }   
        return true;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(1);
        boolean anse=checkPalindrome(head);
       System.out.println(anse);
       
    }
}