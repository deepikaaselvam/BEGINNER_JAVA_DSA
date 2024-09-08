package Contests;

public class DateManipu {
  
        public String convertDateToBinary(String date) {
            String ans="";int n=date.length()-1;
           while(date.length()-1>0)
           {
                if(n%2==1)
                {
                    ans=ans+"1";
                   
                }
                else
                {
                    ans=ans+"0";
                }
           }
           return ans;
            
        }
  public static void main(String[] args) {
    String date="2080-02-29";
    DateManipu obj=new DateManipu();
    System.out.println(obj.convertDateToBinary(date));
    
  }
 
    
}
