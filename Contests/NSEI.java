package Contests;
import java.util.Arrays;
public class NSEI {

    public static void main(String[] args) {
        int[]array={4,5,2,10,8};
        int n=array.length;
        int result[]=new int[n];
        result[0]=-1;
        for(int i=1;i<n;i++)
        {
            result[i]=-1;//Defaulty set to -1,if No element is smaller than the current element
            for(int j=i-1;j>=0;j--)
            {
                if(array[j]<array[i])
                {
                    result[i]=array[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));

    }
    
}
