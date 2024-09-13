package StringsConcept;

public class XConsonant {
    public static void main(String[] args) {
        String s="assurance";
        char[]array=s.toCharArray();
       int X=5;
       boolean printed=false;
       String vowels="aeiouAEIOU";
       for(int i=0;i<X;i++)
       {
        if(vowels.indexOf(array[i])==-1)
        {
            System.out.print(array[i]);
            printed=true;
        }
       }
       if(printed==false)
       {
        System.out.println("-1");
       }
   
    }
    
}
