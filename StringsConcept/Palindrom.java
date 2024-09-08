package StringsConcept;

public class Palindrom {
    public static void main(String[] args) {
        String s="abba";
        int l=0;
        int r=s.length()-1;
        int  flag=1;
        while(l<=r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                flag=0;
                break;
            }
            l++;
            r--;
        }
        if(flag==1)
        {
            System.out.println("It is true");
        }
        else{
            System.out.println("It is false");
        }
    
    }
    
}
