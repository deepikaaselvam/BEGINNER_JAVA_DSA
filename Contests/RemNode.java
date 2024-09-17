package Contests;
import java.util.ArrayList;
public class RemNode {
    public static ArrayList<Integer> removeNodeFRomLL(int[]arr1)
    {
        ArrayList<Integer>max=new ArrayList<>();
        int maxi=0;
        int mini=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>maxi)
            {
                maxi=arr1[i];
                max.add(maxi);
            }
            else if(arr1[i]>mini){
                mini=arr1[i];
                
            }
    
        }
        return max;

    }
    public static void main(String[] args) {
        int[]array={5,2,13,3,8};
        ArrayList<Integer>ans=removeNodeFRomLL(array);
        System.out.println(ans.toString());
    }
    
}
