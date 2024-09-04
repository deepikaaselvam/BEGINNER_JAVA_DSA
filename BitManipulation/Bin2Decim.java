package BitManipulation;

public class Bin2Decim {
    public static int convertBinaryToDecimalNumber(String bin)
    {
        int number=0,power=1;
        for(int i=bin.length()-1;i>=0;i--)
        {
          
            if(bin.charAt(i)=='1')
            {
                number=number+power;
            }
            power=power*2;
        }
        return number;
    }
    public static void main(String[] args) {
        String Binary="11001";
        int number=convertBinaryToDecimalNumber(Binary);
        System.out.println(number);
    }
    
}
