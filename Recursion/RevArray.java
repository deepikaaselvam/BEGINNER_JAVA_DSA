package Recursion;

public class RevArray {
    public static int[] reverse(int[]arr, int i,int n)
    {
        if(i>=n/2)
        {
            return arr;
        }
       int temp=arr[i];
       arr[i]=arr[n-i-1];
       arr[n-i-1]=temp;
        return arr;
    }
   
    
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        for(int i=0;i>array.length;i++)
        {
            reverse(array,0,array.length-1);
        }
        System.out.println(array.toString());
        
    }
    
}
