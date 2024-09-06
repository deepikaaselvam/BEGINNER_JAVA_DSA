package StringsConcept;

public class SBuild1 {
    public static void main(String[] args) {
        String s="Deepika";
        StringBuilder ab=new StringBuilder(s);
        System.out.println(s);
        System.out.println(ab.reverse().toString());
        ab.append("Ammma");
        System.out.println(ab);
        System.out.println(ab.charAt(11));
        System.out.println(s.length());
        System.out.println(ab.length());

    }
    
}
