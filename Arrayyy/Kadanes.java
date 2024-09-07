package Arrayyy;

public class Kadanes {
    public static int maximumSubarray(int[]arra)
    {
        int maximum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arra.length;i++)
        {
            sum=sum+arra[i];
            if(sum<0)
            {
                maximum=Math.max(sum,maximum);
                sum=0;
            }
            else if(sum>maximum)
            {
                maximum=sum;
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[]array={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray(array));
        
    }
  
    
}
