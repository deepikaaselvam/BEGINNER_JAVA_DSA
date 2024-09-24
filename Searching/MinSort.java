package Searching;

public class MinSort {
    public static int minElement(int[]nums)
    {
        int l=0;
        int r=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(l<=r)
        {
            int mid=(l+(r-l)/2);
            
            if(nums[l]<=nums[mid])
            {
                min=Math.min(min,nums[l]);
                l=mid+1;
            }
            else{
                
                min=Math.min(min,nums[mid]);
                r=mid-1;
            }
        //     if(nums[l]<=nums[r])         //my code is almost correct!!!
        //     {
        //         min=nums[l];
        //         if(nums[mid]>=min)
        //         {
        //             r=mid-1;
        //         }
        //         else{
        //             l=mid+1;
        //         }
        //     }
        //     else{
        //         min=nums[r];
        //         if(nums[mid]>min)
        //         {
        //             l=mid+1;
        //         }
        //         else{
        //             r=mid-1;
        //         }
        //     }
         }
        return min;

    }
    public static void main(String[] args) {
        int[]array={7,8,1,2,3,4,5,6 };//3,4,5,1,2  //4,5,6,1,2,3  //11,13,15,17  //4,5,6,7,0,1,2  //4, 5, 6, 7, 8, 9, 0, 1, 2, 3  //5,1,2,3,4
        System.out.println(minElement(array));;

    }
    
}
