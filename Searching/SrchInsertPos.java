package Searching;

public class SrchInsertPos {
    public static int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int answer= nums.length;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
            {
                answer=mid;
                return answer;
            }
            else if(nums[mid]<=target)
            {
                answer=l=mid+1;
            }
            else
            {
                answer=mid;
                r=mid-1;
                
            }
        }
        return answer;
    }
        
    public static void main(String[] args) {
        int[]array={1,3,4,6};
        int target=2;
        System.out.println(searchInsert(array,target));
        
    }
    
}
