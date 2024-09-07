package Arrayyy;

public class Kadanes {
    public static int maximumSubarray(int[]arra)
    {
        int maximum=Integer.MIN_VALUE;
        int sum=0;int ansStart=-1,ansEnd=-1,Start=-1;
        for(int i=0;i<arra.length;i++)
        {
            if(sum==0)
            {
                Start=i;
            }
            sum=sum+arra[i];
            if(sum<0)
            {
                maximum=Math.max(sum,maximum);
                sum=0;
            }
            
            else if(sum>maximum)
            {
                maximum=sum;
                ansStart=Start;
                ansEnd=i;
            }
        }
        System.out.print("Maximum subarray elements are:");
        for(int i=ansStart;i<=ansEnd;i++)
        {
            System.out.print(arra[i]+" ");
        
        }
        System.out.println();
        return maximum;
    }
    public static void main(String[] args) {
        int[]array={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray(array));
        
    }
  
    
}
