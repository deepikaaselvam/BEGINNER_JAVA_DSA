package Arrayyy;
import java.util.HashMap;
public class EqualArrays {
    public static boolean checkEqualArray(int[]a1,int[]a2)
    {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int cnt=0;
        for(int i=0;i<a1.length;i++)
        {
            if(mpp.get(a1[i])==null)///Initially all the ellement are not present in the map,So added it into a map
            {
                mpp.put(a1[i],1);//(1,1),(2,1),(2,2),(5,1)=Finally (1,1),(2,2),(5,1) in map
            }
            else{
                cnt=mpp.get(a1[i]);//2 is already inserted 1 tym in a map,So take a cnt of it and add it 
                cnt++;
                mpp.put(a1[i],cnt);
            }
        }
        for(int i=0;i<a1.length;i++)
        {
            if(!mpp.containsKey(a2[i]))//if suppose "a2 array" does not contain the map element,Directly return false
            {
                return false;
            }
            cnt=mpp.get(a2[i]);//take a cnt and decrement it ,if the "adding & subtracting cnt" is "0" @ some time,Equalize,Then return "True"
            --cnt;
            mpp.put(a2[i],cnt);
        }

        return true;

    }
    public static void main(String[] args) {
        int[]arr1={1,2,2,5};
        int[]arr2={2,5,1,2};
        System.out.println(checkEqualArray(arr1,arr2));

    }
    
}
