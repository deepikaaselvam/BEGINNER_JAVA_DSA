package TwoPointer;

public class ConstWind {
    public static void main(String[] args) {
        int[]array={-1,2,3,3,4,5,-1};
        int sum=0;int n=array.length;
        int k=4,l=0,r=k-1;
        for(int i=0;i<=r;i++)
        {
            sum+=array[i];
        }
        int maaximum=sum;
        while(r<n-1)
        {
            sum=sum-array[l];
            l++;
            r++;
            sum=sum+array[r];
            maaximum=Math.max(maaximum,sum);
        }
        System.out.println(maaximum);
    }
    
}
