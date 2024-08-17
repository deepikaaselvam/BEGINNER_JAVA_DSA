package LL;

public class Traverse {
   
    public  class Node{
        int data;
        Node next;
        Node(int data1,Node next1)
        {
            this.data=data1;
            this.next=next1;

        }
       Node(int data2)
       {
        this.data=data2;
        this.next=null;
       }
    }
    public static void main(String[] args) {
        int[]arr={2,1,3,4,5};
        Traverse t=new Traverse();
        Node s=t.new Node(arr[0]);
        System.out.println(s.data);
        
        
        
    }
    
}
