package StringsConcept;

import java.nio.charset.Charset;

public class changStr {
    public static void main(String[] args) {
        String string="Kavitha";
        String a=string;
        String b=string;
        String c=string;
        System.out.print(string+" "+a+" "+b+" "+c+"\n");
        string="Selvam";
        System.out.print(string+" "+a+" "+b+" "+c+"\n");
        // String diff=null;                     //NullPointerException
        // System.out.println(diff.length());
        char[]array={97,98,99,100};
        String s=new String(array);
        System.out.println(s+" ");
       
        byte[] b_arr = {71, 101, 101, 107, 115};
        String str1 = new String(b_arr); //Geeks
        byte[] b_arr1 = {71, 101, 101, 107, 115};
        Charset cs1 = Charset.defaultCharset();
        String s_byte_char = new String(b_arr1, cs1);
        System.out.println(s_byte_char);
        System.out.println(str1);
        byte[]array2={92,98,97,99};
        String string2=new String(array2);
        System.out.println(string2);
        String s1="Deepia";
        String s2="Dee";
        boolean b1=s1.contains(s2);
        System.out.println(b1);


    }
    
}
