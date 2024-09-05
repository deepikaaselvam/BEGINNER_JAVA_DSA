package Arrayyy;
import java.util.HashSet;
public class RemDup {
    public static int removeDuplicatesInArray(int[]array)
    {
        HashSet<Integer>hash=new HashSet<>();
        for(int i=0;i<array.length;i++)
        {
            hash.add(array[i]);
        }
        return hash.size();
      
    }
    public static void main(String[] args) {
        int arr[]={12,13,12,14,23,13,14};
        System.out.println(removeDuplicatesInArray(arr));
    }
    
}
