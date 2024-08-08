package ArrayConcept;
public class OptLongSubarr {
    public static void main(String[] args) {
        int[]LongestSubArray={2,5,1,7,10};
        int n=LongestSubArray.length;
        int l=0,r=0,sum=0,maxLen=0;int k=14;
        int cnt=0;
        while(r<n-1)
        {
            sum+=LongestSubArray[r];
            if(sum>k){
                sum -=LongestSubArray[l];
                l++;
            }
            
            if(sum<=k)
            {
                
                maxLen=Math.max(maxLen,sum);
                r++;
                cnt++;
            }
          
           
        }
        System.out.println(maxLen+" "+cnt);
    }
}