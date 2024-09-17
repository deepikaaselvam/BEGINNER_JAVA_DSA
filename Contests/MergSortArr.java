package Contests;
import java.util.Arrays;
public class MergSortArr {
    public static void mergeSortedArray(int[]arr1,int[]arr2)
    {
        // ArrayList<Integer>list=new ArrayList<>();
        int m=arr1.length;
        int n=arr2.length;
        int i=0,j=0;
        int answer[]=new int[m+n];
        int index=0;
        while(i<m && j<n)
        {
            if(arr1[i]<=arr2[j])
            {
                answer[index]=arr1[i];
                i++;
                index++;
               
            }
            else{
              answer[index]=arr2[j];
              j++;
              index++;
            }
        }
        while(i<m)
        {
                answer[index]=arr1[i];
                i++;
                index++;
        }
        while(j<n)
        {
            answer[index]=arr2[j];
                j++;
                index++;
        }
           System.out.println(Arrays.toString(answer));
    }
 

    
    public static void main(String[] args) {
        int[]array1={1,2,3,0,0,0};
        int[]array2={2,5,6,0,0};
        mergeSortedArray(array1,array2);
    }
    
}

