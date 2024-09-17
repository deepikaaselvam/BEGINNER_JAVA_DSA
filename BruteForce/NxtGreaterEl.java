package BruteForce;
import java.util.Arrays;
public class NxtGreaterEl {
    public static void main(String[] args) {
        int[]array1={6,0,8,1,3};
        int n=array1.length;
        
        int  Array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(array1[j]>array1[i])
                {
                    Array[i]=array1[j];
                    break;
                }
            }
          
            
        }
        System.out.println(Arrays.toString(Array));
    }
    
}
