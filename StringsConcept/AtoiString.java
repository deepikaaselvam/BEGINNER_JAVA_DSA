package StringsConcept;
public class AtoiString {
   public static int isAtoiOftheString(String str)
    {
        int result=0; 
        char[]CharArrayyy=str.toCharArray();
        for(int i=0;i<CharArrayyy.length;i++)
        {
            if(str.charAt(i)=='W'||str.charAt(i)=='w')
            {
                return 0;
          
            }
            if((CharArrayyy[i]=='1'||CharArrayyy[i]=='2' ||
            CharArrayyy[i]=='3'||CharArrayyy[i]=='4'||CharArrayyy[i]=='5'
            ||CharArrayyy[i]=='6'||CharArrayyy[i]=='7'||CharArrayyy[i]=='8'
            ||CharArrayyy[i]=='9'))
            {
                int ans=str.charAt(i)-'0';
                result=result*10+ans;
                
            }
            if(CharArrayyy[i]=='0'&& !Character.isDigit(CharArrayyy[i+1]))
            {
                return 0;
            }
            if(CharArrayyy[i]=='0')
            {
               i++;
            }
            if(CharArrayyy[i]==' ')
            {
                
            }
            // if(CharArrayyy[i]=='0')
            // {
            //     i++;
            // }
           
        
        }
    return result;
    }
    public static void main(String[] args) {
        String s="  -042";//   -042
        System.out.println(isAtoiOftheString(s));
    }
}
