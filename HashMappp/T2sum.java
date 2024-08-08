package HashMappp;

import java.util.HashMap;

public class T2sum {
    public static void main(String[] args) {
        int TwoSum[]={1,2,4};
        int n=TwoSum.length;
        int target=6;
        HashMap<Integer,Integer>set=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int num=target-TwoSum[i];
            if(set.containsKey(num))
            {
               int arr[]={set.get(num),i};
               System.out.println(arr);
            }
            set.put(TwoSum[i],i);
        }
        // System.out.println(set);
       
    }
    
}
