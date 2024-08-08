package TwoPointer;
public class MaxWindow {
    public static void maximumpartarray(int[]nums,int k)
{
    int n=nums.length;
    int lsum=0,rsum=0,maxSum=0;
    for(int i=0;i<k;i++)
    {
        lsum=lsum+nums[i];
        maxSum=lsum;
    }
   int rindex=n-1;
    for(int i=k-1;i>=0;i--)
    {
        lsum=lsum-nums[i];
        rsum=rsum+nums[rindex];
        maxSum=Math.max(maxSum,(lsum+rsum));
        rindex--;
    }
    System.out.println("\n"+maxSum);
}
    public static void main(String[] args) {
        int number[]={6,2,3,4,7,2,1,7,1};
        int k=4;
        maximumpartarray(number,k);
    }
    
}
