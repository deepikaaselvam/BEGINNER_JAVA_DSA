package HashMappp;
import java.util.HashMap;
public class BruteMyLongSu {
    public static int distinct(String str)
    {
        int n=str.length();int k=2;int len=0;
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
             
            mpp.clear();
            for(int j=i;j<n;j++)
            {
                mpp.put(str.charAt(j),j);
                
                if(mpp.size()<=k)
                {
                    len=Math.max(len,j-i+1);
                }
                else
                break;
            }
        }


        return len;
    }
    public static void main(String[] args) {
        String s="aaabbccd";
        System.out.println(distinct(s));
    }
    
}
