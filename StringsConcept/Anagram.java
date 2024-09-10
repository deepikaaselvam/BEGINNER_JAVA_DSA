package StringsConcept;
import java.util.Arrays;
public class Anagram {
    public static boolean isAnagram(String str1,String str2)
    {
      
        if(str1.length()==str2.length())
        {
            System.out.println("Proceed your process");
        }
        
        char[]arr1=str1.toCharArray();
        char[]arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);

    }
    public static void main(String[] args) {
        String s="car";
        String  t="tra";
        System.out.println(isAnagram(s, t));

        
        
    }
    
    
}
