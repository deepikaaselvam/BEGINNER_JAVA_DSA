package Searching;

public class UBound {
    public static int UpperBound(int[]arr,int target)
    {
        int answer=arr.length;
        int l=0,r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]>target)
            {
                answer=arr[mid];
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return answer;

    }
    public static void main(String[] args) {
        int[]array={2,3,6,7,8,8,11,11,11,12};
        int target=11;
        System.out.println(UpperBound(array,target));
    }
    
}
