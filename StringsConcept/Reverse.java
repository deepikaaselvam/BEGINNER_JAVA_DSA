package StringsConcept;

public class Reverse {
    public static String reverseString(String str)
    {
        String newString="";
        for(int i=str.length()-1;i>=0;i--)
        {
            newString=newString+str.charAt(i);
        }
        return newString;

    }
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(reverseString(s));
    }
    
}
