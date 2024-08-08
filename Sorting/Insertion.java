package Sorting;
import java.util.Arrays;
public class Insertion {
    public static int[]InsertionSort(int Array[],int len)
    {
        for(int i=1;i<len;i++)
        {
            int j=i;
                while(j>0 && Array[j-1]>Array[j])
                {
                    int temp=Array[j];
                    Array[j]=Array[j-1];
                    Array[j-1]=temp;
                    j--;
                }
               System.out.println(Arrays.toString(Array));
        }
        return Array;
    }
    public static void main(String[] args) {
        int insertArray[]={-1, -3, 2, 0, -2};
        int length=insertArray.length;
       int result[]= InsertionSort(insertArray,length);
       for(int i=0;i<result.length;i++)
       {
        System.out.print(result[i]+" ");
       }
    }
}
