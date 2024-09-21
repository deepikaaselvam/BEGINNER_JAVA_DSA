package Searching;
public class BSearch {
    public static int binarySearch(int[]array,int n,int target)
    {
        int l=0,r=array.length-1;
      
        int index=-1;
        while(l<=r)
        {
            int mid=(l+(r-l)/2);
            if(array[mid]==target)
            {
                 index=mid;
                break;
            }
            else if(array[mid]<target)
            {
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(index==-1)
        {
            return -1;
        }
        return index;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int n=arr.length;int target=5;
        System.out.println("index : "+binarySearch(arr,n,target));
        
    }
}
