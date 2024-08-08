package Sorting;
public class Bubble {
    public static int[]BubbleSort(int[]array,int n)
    {
        for(int i=n-1;i>=1;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                   
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
            
        }
        return array;
    }
    public static void main(String[] args) {
        int[]array={98,72,12,64};
        int n=array.length;
        int arr[]=BubbleSort(array,n);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
