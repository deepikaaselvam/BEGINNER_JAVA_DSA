package Searching;
public class BSearch {
    public static int binarySearch(int[]array,int n,int target)
    {
        int l=0,r=array.length-1;
        int ans=0;
        int index=0;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(array[mid]==target)
            {
                 index=mid;
                ans=1;
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
        if(ans==0)
        {
            return -1;
        }
        return index;
    }
    public static void main(String[] args) {
        int[]arr={3,4,6,7,9,12,6,17};
        int n=arr.length;int target=12;
        System.out.println(binarySearch(arr,n,target));
        
    }
}
