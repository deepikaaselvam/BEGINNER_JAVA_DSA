package Searching;

public class LBound {
    public static int lowerBound(int[]a,int target)
    {
        int l=0,r=a.length-1;
        int ans=a.length;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(a[mid]==target)
            {
                ans=mid;
                return ans;
            }
            else if(a[mid]>=target)
            {
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]array={2,3,6,7,8,8,11,11,11,12};
        int x=19;
        System.out.println(lowerBound(array,x));
    }
    
}
