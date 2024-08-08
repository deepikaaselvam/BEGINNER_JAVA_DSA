package BruteForce;
import java.util.HashMap;
import java.util.Map;
public class HashChar2 {
    public static void main(String[] args) {
        String s="abcdabefd";int r=0;
        int n=s.length();
        HashMap<Character,Integer>mpp=new HashMap<>();
        while(r<n)
        {
            // char c=s.charAt(r);
            mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
            r++;
        }
          for (Map.Entry<Character, Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + "-> " + entry.getValue());
            
        }
    }
    
}
