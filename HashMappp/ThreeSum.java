package HashMappp;

public class ThreeSum {
    public static int[]ThreeSumValue(int []arr,int target)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]==target-arr[k])
                    {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                    
                }
            }
            
        }
        return null;
       
    }
    public static void main(String[] args) {
        int[]array={-1,0,1,2,-1,-4};
        int n=array.length;
        int target=0;
        System.out.println(ThreeSumValue(array,target));
    }
    
}
