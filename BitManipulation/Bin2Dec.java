package BitManipulation;
public class Bin2Dec {
    public static int convertBinaryToDecimal(String b)
    {
        int previous =0;int exponent=0;
        for(int i=b.length()-1;i>=0;i--)
        {
            int digit=b.charAt(i)-'0';       //'0' it will minus the '1' ->character value 49-48!!!
            previous=previous + (digit *(int)(Math.pow(2,exponent)));
            exponent++;

        }
        return previous;
    }
     public static void main(String[] args) {
        String Binary="111";
       double number= convertBinaryToDecimal(Binary);
       System.out.println(number);
    }
}
