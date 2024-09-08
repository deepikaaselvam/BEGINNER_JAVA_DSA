package Contests;
import java.lang.String;

public class BitMani {
    public static void main(String[] args) {
    //     String date="2018-09-02";
    //     String[] dateArray=date.split("-");
    //     int[]array=new int[dateArray.length];
    //     String ans="";
    //     String newString[]=new String[array.length];
    //     for(int i=0;i<array.length;i++)
    //     {
    //         array[i]=Integer.parseInt(dateArray[i]);
    //         int n=array[i];
    //         ans="";
    //         while(n>0)
    //         {
                
    //             if(n%2==0)
    //             {
    //                ans=ans+"0"; 
    //             }
    //             else{
    //                 ans=ans+"1";
    //             }
    //             n=n/2;
    //         }
    //         newString[i]=ans;
       
           
    //     }
    //     StringBuilder sb=new StringBuilder();
    //     for(String answer:newString)
    //     {
    //         sb.append(answer+"\n");
    //     }
    //      System.out.println(sb.reverse());
    String date="2018-09-02";
    String newStringArray[]=date.split("-");
    String yearBinary=Integer.toBinaryString(Integer.parseInt(newStringArray[0]));
    String MonthBinary=Integer.toBinaryString(Integer.parseInt(newStringArray[1]));
    String dayBinary=Integer.toBinaryString(Integer.parseInt(newStringArray[2]));
    System.out.println(yearBinary+"-"+MonthBinary+"-"+dayBinary);
    }
}

