package Contests;

public class MinSubArr {
    public static void sumOftheSubarrayMinimum(int[]arr)
    {
        int minimum=0;int sum=0;int mod=(int)(1e9+7);
        for(int i=0;i<arr.length;i++)
        {
            int mini=arr[i];
            for(int j=i;j<arr.length;j++)
            {
                minimum=Math.min(mini,arr[j]);
                sum=(sum+minimum)%mod;
            }
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        int[]array={3,1,2,4};
        sumOftheSubarrayMinimum(array);
    }
    
}
