package StringsConcept;

public class Palindrome {
    public static void main(String[] args) {
        String str="amannma";
        int n=str.length();
        int i=0;
        int j=n-1;
        boolean Palindrome=true;
        while(i<j)
        {
            
            if(str.charAt(i)!=str.charAt(j))
            {
                Palindrome=false;
                break;
               
            }
            i++;
            j--;
        }
        if(Palindrome==true)
        {
            System.out.println("String is the Palindrome");
        }
        else{
            System.out.println("String is not the Palindrome");
        }
    }
    
}
