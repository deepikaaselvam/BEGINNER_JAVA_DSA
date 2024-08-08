package Sorting;

public class SortArray {
    public static boolean SortTheArray(int[]arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {
                return false;
            }
            
        }
        return true;

    }
    public static void main(String[] args) {
        int[]array={1,2,2,3,3};
        System.out.println(SortTheArray(array));
    }
}
