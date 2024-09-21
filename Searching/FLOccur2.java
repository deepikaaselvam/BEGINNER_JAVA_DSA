package Searching;

public class FLOccur2 {
    public static int firstOccurence(int[]array,int x)
    {
        int low=0,high=array.length-1;
        int first=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(array[mid]==x)
            {
                first=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return first;
    }
    public static int lastOccurence(int[]array,int x)
    {
        int low=0,high=array.length-1;
        int last=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(array[mid]==x)
            {
                last=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int[]arr={2,4,8,8,8,8,11,13};
        int x=8;
        System.out.println(firstOccurence(arr,x)+" "+lastOccurence(arr,x));
        
    }
    
}
