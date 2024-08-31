package DLL;
// import java.util.LinkedList;
import java.util.Stack;
public class RevDLL {
    public static DLLNode convertArray2DLL(int[]arr)
    {
        DLLNode head=new DLLNode(arr[0]);
        DLLNode previous=head;
        for(int i=1;i<arr.length;i++)
        {
            DLLNode current=new DLLNode(arr[i]);
            previous.next=current;
            previous=current;
        }
        return head;
    }
    public static DLLNode reverseDLL(DLLNode head)
    {
        Stack<Integer>st=new Stack<>();
        DLLNode current=head;
        while(current!=null)
        {
            st.push(current.data);
            current=current.next;
        }
        current=head;
        while(current!=null)
        {
            current.data=st.pop();
            current=current.next;
        }
        return head;
    }
    public static void printList(DLLNode head)
    {
        DLLNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        int[]arrray={12,5,8,7};
        DLLNode head=convertArray2DLL(arrray);
        printList(head);
        System.out.println();
        head=reverseDLL(head);
        printList(head);
    }
    
}
