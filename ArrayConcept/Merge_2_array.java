package ArrayConcept;
// import java.util.Arrays;
import java.util.ArrayList;
public class Merge_2_array {
    
    public static void main(String[] args) {
        int[]nums1={1,2,3,0,0,0};
        int []nums2={2,5,6};
        int m=3;int n=3; int s=m+n;
        ArrayList<Integer>array=new ArrayList<>();
        for(int i=0;i<s;i++)
        {
        
            if(nums1[i]<=nums2[i])
            {
                array.add(nums1[i]);
               
                
       
            }
            else if(nums1[i]==0)
            {
                array.add(nums2[i]);
                nums2[i]++;
                
            }
            else if(nums2[i]==0)
            {
                array.add(nums1[i]);
                nums1[i]++;
               
            }
            else
            {
               array.add(nums2[i]);
               nums2[i]++;
              
            }
        }
        System.out.print(array+" ");
       
       
        
    }
}
