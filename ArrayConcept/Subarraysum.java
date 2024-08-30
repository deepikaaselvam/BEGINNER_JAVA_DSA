package ArrayConcept;

public class Subarraysum {
    public static int subArraywithSumequalsK(int[]array,int k)
    {
        int sum=0;
        int l=0;
        int r=0;int maxLen=0;
        while(l<r)
        {
            sum=sum+array[r];
            if(sum>k)
            {
                sum=sum-array[l];
                l++;
            }
            maxLen=Math.max(maxLen,sum);
            r++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int array[]={1,1,2};
        int k=2;
        System.out.println(subArraywithSumequalsK(array,k));
    }
    
}
