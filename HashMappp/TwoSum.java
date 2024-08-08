package HashMappp;

import java.util.HashMap;
import java.util.Arrays;
public class TwoSum {
   
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            Integer diff=(target-nums[i]);
            if(hash.containsKey(diff))
            {
                int ret[]={hash.get(diff),i};
                return ret;
            }
            hash.put(nums[i],i);
        }
        return null;
        
    }
    public static void main(String[] args) {
        int[]array={3,2,4};
        int target=6;
        TwoSum ts=new TwoSum();
        System.out.println(Arrays.toString(ts.twoSum(array,target)));
       
    }
}
    

