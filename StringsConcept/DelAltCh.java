package StringsConcept;

public class DelAltCh {
    public static void main(String[] args) {
        String str="GeeksforGeeks";
        String newString="";
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                newString=newString+str.charAt(i);
            }
        }


        System.out.println("\n"+newString+"\n");
    }
    
}
