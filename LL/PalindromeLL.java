package LL;
import java.util.Stack;
public class PalindromeLL {
    public static boolean isPalindrome(Node head)
    {
       Stack<Integer>st=new Stack<>();

       for(Node curr=head;curr!=null;curr=curr.next)
       {
        st.push(curr.data);
       } 
       for(Node curr=head;curr!=null;curr=curr.next)
       {
        if(st.pop()!=curr.data)
        {
            return false;
        }
    }

        return true;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(1);
        System.out.println(isPalindrome(head));
    }
    
}
