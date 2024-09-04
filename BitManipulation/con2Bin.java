package BitManipulation;

public class con2Bin {
    public static String convertintoBinary(String result,int n)
    {
        while(n>0)
        {
            if(n%2==1)
            {
                result=result+"1";
            }
            else
            {
                result=result+"0";
            }
            n=n/2;
        }
         String answer="";
        for(int i=result.length()-1;i>=0;i--)
        {
            answer=answer+result.charAt(i);
        }
        
       
        return answer;
    }
    public static void main(String[] args) {
        int n=13;
        String result="";
        System.out.println(convertintoBinary(result,n));
    }
    
}
