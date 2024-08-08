package StringsConcept;

public class Deletechar {
    public static String DeleteParticularChar(char[]a,char ch)
    {
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=ch)
            {
                a[j++]+=a[i];
            }
            
        }
        return a.toString();
     
    }
    public static void main(String[] args) {
        String s1="GeeksForGeeks";
        char[]array=s1.toCharArray();
        char ch='g';
        System.out.println(DeleteParticularChar(array,ch)+" ");
    }
    
}
