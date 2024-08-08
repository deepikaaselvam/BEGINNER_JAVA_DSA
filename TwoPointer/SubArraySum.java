package TwoPointer;
public class SubArraySum {
    public static void main(String[] args) {
        int SubArraySum[]={2,3,1,2,4,3};
        int target=7;
        int n=SubArraySum.length;
        int sum=0;int maxLength=Integer.MAX_VALUE;
        int l=0,r=0;
        while(r<=n-1)
        {
            
            sum+=SubArraySum[r];
           
            while(sum>=target)
            {
                maxLength=Math.min(maxLength,r-l+1);
                sum -=SubArraySum[l];
                l++;
            }
           
            r++;
        }
        if(maxLength==Integer.MAX_VALUE)
        {
            System.out.println(0);
        }
        else{
        System.out.println(maxLength+" ");}
        
            
        
       
    }
    
}
