package StringsConcept;
import java.nio.charset.Charset;

public class CharSet {
    public static void main(String[] args) {
        byte[]bytearray={65,114,106,117,110};
        Charset csv=Charset.defaultCharset();
        String strings=new String(bytearray,csv);
        System.out.println(strings);
        char[]array1={97,98,99,100,101,102};
        String s1=new String(array1,1,3);
        System.out.println(s1+" ");
        String s2="Learn Share Learn";
        int output=s2.indexOf("Lea",90);
        System.out.println(output);
        String s9="bkshaya";
        String s10="Anktha";
        int outputvalue=s9.compareToIgnoreCase(s10);
        System.out.println(outputvalue);
        String Lower="HELOO";
        System.out.println(Lower.toLowerCase());
        System.out.println(Lower);
        String Replace_1="feeksforfeeks";
        String replace2= "feeksforfeeks".replace('f','g'); // return “geeksgorgeeks”
        System.out.println(replace2);
        System.out.println(Replace_1);
        String new_idea="Geeks";
        System.out.println(new_idea.replace('G','f'));
        String a="Geeks";
        String b="e";
        System.out.println(a.contains(b));
        String sq="geeks";
        char[]ch=sq.toCharArray();
        System.out.println(ch);
        String star1="KavithaSelvam";
        String star2="K";
        // star2.concat("Avitha");                 ///the Original String will never change!
        // System.out.println(star2);

        System.out.println(star1.startsWith(star2));
        String a1=new String("Deepika ");
        System.out.println(a1.concat("  ->     Love SDE"));
    }
    
}
