package Contests;
import java.lang.String;
public class ToChessBoad {
    public static boolean checkTwoChessBoardEquals(String c1,String c2)
    {
        char f1=c1.charAt(0);
        char f2=c2.charAt(0);
        int column1=(f1-'a')+1;
        int column2=(f2-'a')+1;
        int row1=Integer.parseInt(c1.substring(1));
        int row2=Integer.parseInt(c2.substring(1));
        int color1=(column1+row1)%2;
        int color2=(column2+row2)%2;
        if(color1==color2){
            return true;
            
        }

        return false;
    }
    public static void main(String[] args) {
        String s1="a1";
        String s2="c4";
       boolean answer= checkTwoChessBoardEquals(s1,s2);
       System.out.println(answer);
    }
    
}
