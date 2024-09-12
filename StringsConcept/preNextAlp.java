package StringsConcept;

public class preNextAlp {
    public static void previousAndNextAlphabet(char c)
    {
        if(c=='a')
        {
            System.out.println('z'+""+(char)(c+1));;
        }
        if(c=='z')
        {
            System.out.println((char)(c-1)+""+'a');
        }
        if(c!='a' &&c!='z')
        System.out.println((char)(c-1)+""+(char)(c+1));
    }
    public static void main(String[] args) {
       char ch='a';
       previousAndNextAlphabet(ch);
    }
    
}
