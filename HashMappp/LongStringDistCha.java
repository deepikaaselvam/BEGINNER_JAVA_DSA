package HashMappp;
import java.util.HashMap;
public class LongStringDistCha {
    public static int distictChar(String str,int k)
    {
        int len=0;int n=str.length();
        HashMap<Character,Integer>mpp=new HashMap<>();
        int l=0;
        for(int r=0;r<n;r++){
            mpp.put(str.charAt(r),mpp.getOrDefault(str.charAt(r),0)+1);
            while(mpp.size()>k)
            {
                mpp.put(str.charAt(l),mpp.get(str.charAt(l))-1);
                
                if(mpp.get(str.charAt(l))==0)
                {
                    mpp.remove(str.charAt(l));
                }
                l++;
            }
            len=Math.max(len,r-l+1);
        }
        return len;
    }
    public static void main(String[] args) {
        String s="aaabbccd";
        int k=2;
        System.out.println(distictChar(s,k));;
       
    }
    
}
