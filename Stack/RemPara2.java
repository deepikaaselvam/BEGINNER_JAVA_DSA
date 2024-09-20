package Stack;

public class RemPara2 {
    public  void removeOuterParentheses(String s)
    {
        int cnt=0;
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<s.length();i++)
        {
           if(s.charAt(i)=='(')
           {
            cnt++;
            ans.append(s.charAt(i));
           }
           else 
           {
            if(cnt==0)
            {
                i++;
            }
            else{
                ans.append(s.charAt(i));
                cnt--;
            }
           }
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        String s="(())(()())";
        RemPara2 r1=new RemPara2();
       r1.removeOuterParentheses(s);
    }
    
}
