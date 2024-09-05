package Arrayyy;
public class MaxSubSum {
    public static void main(String[] args) {
        int[]arr={-2,-3};
        int n=arr.length;int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
            }
            maxi=Math.max(maxi,sum);
        }
        System.out.println(maxi+"    ");
        
    }
    
    
}
