package Searching;

public class RecBS {
    public static int recursiveBinarySearch(int[]arrr,int l,int r,int target)
    {
        if(l>r){
            return -1;
        }
        int mid=(l+(r-l)/2);
        if(arrr[mid]==target)
        {
            return mid;
        }
        else if(arrr[mid]<target)
        {
            return recursiveBinarySearch(arrr, mid+1, r, target);
        }
        return recursiveBinarySearch(arrr, l, mid-1, target);
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        int target=5;
        int left=0,right=array.length-1;
        System.out.println(recursiveBinarySearch(array,left,right,target));
    }
    
}
