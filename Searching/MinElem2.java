package Searching;

public class MinElem2 {
    public int findMin(int[] nums) {
            int l=0;
            int r=nums.length-1;
            int minimum=Integer.MAX_VALUE;
            while(l<=r)
            {
                int mid=(l+(r-l)/2);
                if(nums.length>1)
                {
                     if(nums[l]==nums[r])
                    {
                       
                        minimum=Math.min(minimum,nums[l]);
                        l=l+1;
                        r=r-1;
                        continue;
                        
                    }
                }
                if(nums[l]<=nums[mid])
                {
                   minimum=Math.min(minimum,nums[l]);
                    l=mid+1;
                }
                else
                {
                    minimum=Math.min(minimum,nums[mid]);
                    r=mid-1;
                }
            }
            return minimum;
        }
    
    public static void main(String[] args) {
        int[]arr={5,1,3}; //3,1,3   //2,2,2,0,1
        MinElem2 miniii=new MinElem2();
        System.out.println(miniii.findMin(arr));
        
    }
    
}
