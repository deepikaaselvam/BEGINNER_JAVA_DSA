package ArrayConcept;
public class MaxarraySum {
    public static void main(String[] args) {
        int[]array={-1,2,3,3,4,5,-1};
        int n=array.length;int k=4;
        int sum=0;
        int l=0,r=k-1;
        for(int i=0;i<n;i++)
        {
            sum+=array[i];
        }
        int maximum=sum;
        while(r!=n-1||r<n-1)
        {
            sum=sum-array[l];
            l++;
            r++;
            sum=sum+array[r];
            maximum=Math.max(maximum, sum);
        }
        System.out.print(maximum);
        
    }
    
}
