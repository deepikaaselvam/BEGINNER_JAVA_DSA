package StringsConcept;
public class Equality {
public static void main(String[] args) {
    String s1="Geeks";
    String s2="Geeks";
    int n1=s1.length(),n2=s2.length();
    if(s1.length()==s2.length())
    {
        for(int i=0;i<Math.min(n1,n2);i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                
            }
        }
        System.out.println("True");
    }
    else {
        System.out.println("false");
    }
}
    
}
