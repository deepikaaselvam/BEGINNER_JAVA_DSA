package Searching;

public class PeakEle {
    public static int peakElement(int[]nums)
    {
        if(nums.length==1)//edge cases
        {
            return 0;
        }
        else if(nums[0]>nums[1])
        {
            return 0;
        }
        else if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;

        }
        int peak=0;
        int l=1,r=nums.length-2;
        while(l<=r)
        {
            int mid=(l+(r-l)/2);
            if(nums[mid-1]>nums[mid]){
               r=mid-1;
            }
            else if(nums[mid+1]>nums[mid]){
                l=mid+1;
            }
            else if((mid==0||nums[mid-1]<nums[mid] )&& (mid==nums.length-1||nums[mid]>nums[mid+1]))
            {
                peak=mid;
                break;
            }
        }
       return peak;

    }
    public static void main(String[] args) {
        int[]array={1,2 };//1,10,13,7,6,5,4,2,1,0   //1,2,3,2   //2,1
        System.out.println(peakElement(array));
    }
    
}
