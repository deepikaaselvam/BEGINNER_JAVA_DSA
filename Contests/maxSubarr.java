package Contests;

public class maxSubarr {
    public static double maxAverageSubarray(int[]array)
    {
        int sum=0,l=0,r=0,max=Integer.MIN_VALUE,len=0;int k=4;
        while(r<array.length)
        {
            sum+=array[r];
            len=r-l+1;
            if(len<=k)
            {
                max=Math.max(max,sum);
                sum=sum-array[l];
                l++;
            }
            
            r++;
        }
        double average=(double)max/k;
        return average;
    }
    public static void main(String[] args) {
        int[]arr={1,12,-5,-6,50,3};
        System.out.println(maxAverageSubarray(arr));
    }
    
}
