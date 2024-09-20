package Stack;

public class RvrseWord {
    public static void main(String[] args) {
        String s="TUF+ is Great For DSA Interview Preparation";
        String newStringg="";
        String answeString="";
        int l=0;
        for(int i=l;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                newStringg+=s.charAt(i);
            }
            else if(s.charAt(i)==' ')
            {
                if(!answeString.equals(" "))
                {
                    answeString=newStringg+" "+answeString;
                }
                else{
                    answeString=newStringg;
                }
                newStringg=" ";
            }
        }
        if(!newStringg.equals(" "))
        {
            if(!answeString.equals(" "))
            {
                answeString=newStringg+" "+answeString;
            }
            else{
                answeString=newStringg;
            }
        }
        String ans=" ";
        for(int i=0;i<answeString.length()-1;i++)
        {
            ans+=answeString.charAt(i);
        }
        System.out.println(ans);

    }
    
}
