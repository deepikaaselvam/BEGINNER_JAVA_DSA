package LL;
import java.util.ArrayList;

public class DelLLarr{
    public static void deleteNodeFromLLToArray(Node head,int[]arrayyy)
    {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arrayyy.length;i++)
        {
            for(Node curr=head;curr!=null;curr=curr.next)
            {
                if(arrayyy[i]==curr.data)
                {
                    list.add(curr.data);
                }
                
               
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node first=new Node(2);
        Node second=new Node(3);
        Node third=new Node(4);
        Node four=new Node(5);
        head.next=first;
        first.next=second;
        second.next=third;
        third.next=four;
        four.next=null;
        int[]arr={1,2,3};
        deleteNodeFromLLToArray(head,arr);

    }
}