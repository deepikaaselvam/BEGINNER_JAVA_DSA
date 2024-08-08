package TwoPointer;
import java.util.HashMap;
public class FruitBasket {
    public static void main(String[] args) {
        int[]array={3,3,3,1,2,1,1,2,3,3,4};
        int n=array.length,count=0;
        int l=0,r=0,maxLen=0;int k=2;
        while(r!=n)
        {
            HashMap<Integer,Integer>map=new HashMap<>();
            map.put(array[r],count);
            if(map.size()>k){
            while(map.size()>k){
            map.remove(array[l]);
            if(map.get(array[l])==0)
            {
                map.remove(array[l]);
            }
            l++;
        }
           }
           if(map.size()<= k)
           {
            maxLen=Math.max(maxLen,r-l+1);
           }
        r++;
        System.out.println(maxLen);
    }

    // System.out.println(maxLen);
}
}
