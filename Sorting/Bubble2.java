package Sorting;

public class Bubble2 {//Understood
    public static int[]BubbleSort(int[]arr)
    {
        int n=arr.length;
        for(int i=n-1;i>=1;i--)//starting i value kuduthaaa,,,atha sort panum poothu apdiye viturum
        {
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
               
            }
            
        }
    return arr;
    }
    public static void main(String[] args) {
        int[]array={13,46,24,52,20,9};
      
        int result[]=BubbleSort(array);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        // String s="Deeepika";
        // int l1=90;
        // int l2=180;
        // System.out.println(s+l1+l2);
    }
    
}
