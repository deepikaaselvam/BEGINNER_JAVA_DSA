package LL;

public class Convert2Arr {
    private static Node convertArrayToLL(int[]arr)
    {
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++)
        {
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }

        return head;

    }
    public static void main(String[] args) {
        int[]arr={12,4,5,6};
        Node head=convertArrayToLL(arr);
        System.out.println(head.data);

    }
    
}
