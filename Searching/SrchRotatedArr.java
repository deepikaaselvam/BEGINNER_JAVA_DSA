package Searching;

public class SrchRotatedArr {
    public static int searchUniqueElementSortedArray(int[]arr,int minimum)
    { 
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+(high-low)/2);
            if(arr[mid]==minimum)
            {
                return mid;
            }
            else if(arr[low]<=arr[mid])
            {
                if(arr[low]<=minimum && minimum <=arr[mid])
                {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(arr[mid]<=arr[high])
            {
                if(arr[mid]<=minimum && minimum<=arr[high])
                {
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        int[]array={7,8,9,1,2,3,4,5,6};
        int minimum=1;
        System.out.println(searchUniqueElementSortedArray(array,minimum));
    }
    
}
