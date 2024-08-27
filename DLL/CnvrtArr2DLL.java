package DLL;

public class CnvrtArr2DLL {
    public static DLLNode convertArray2DLL(int[]array)
    {
        DLLNode head=new DLLNode(array[0]);
        DLLNode prev=head;
        for(int i=1;i<array.length;i++)
        {
            DLLNode current=new DLLNode(array[i],prev,null);//or we can use it as "new DLLNode(array[i])"
            prev.next=current;
            prev=current;
        }
        return head;

    }
    public static void printList(DLLNode answer)
    {
        DLLNode result=answer;
        while(result!=null)
        {
            System.out.print(result.data+" ");
            result=result.next;
        }
    }
    public static void main(String[] args) {
        int arr[]={12,5,8,7};
        DLLNode result=convertArray2DLL(arr);
        printList(result);
    }
    
}
