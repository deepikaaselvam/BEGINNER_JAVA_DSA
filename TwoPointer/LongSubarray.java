package TwoPointer;
public class LongSubarray {
    public static void main(String[] args) {
        int[]LongestSubArray={2,5,1,7,10};
        int n=LongestSubArray.length;
        int l=0,r=0;int sum=0;int k=14;
        int maxLen=0;
        while(r<=n-1)
        {
            sum=sum+LongestSubArray[r];
          
            if(sum>k)
            {
                sum =sum-LongestSubArray[l];
                l++;
            }
            if(sum<=k)
            {
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        System.out.println(maxLen);
    }
}
