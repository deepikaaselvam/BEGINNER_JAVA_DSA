package TwoPointer;
public class WidoutRepChar {
    public static void main(String[] args) {
        String str="cadbzabcd";
        for(int i=0;i<str.length();i++)
        {
            String sub="";
            for(int j=i;j<str.length();j++)
            {
                sub+=str.charAt(j);
                System.out.println(sub);
            }
        }
    }
    
}
