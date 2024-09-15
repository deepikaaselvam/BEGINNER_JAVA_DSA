package Contests;
public class Atoi {
    public static void main(String[] args) {
        String number="123";
        char[]Chararray=number.toCharArray();
        int result=0;
        for(int i=0;i<Chararray.length;i++)
        {
            int ans=Chararray[i]-'0';
            result=result*10+ans;
        }
        System.out.println(result);

    }
    
    
    
}
