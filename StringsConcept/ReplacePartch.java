package StringsConcept;

public class ReplacePartch {
    public static void main(String[] args) {
        String ReplaceParticularCharacter="Deeeika";
        int index=3;
        char Character='p';
        String result=(ReplaceParticularCharacter.substring(0,index)
        + Character + ReplaceParticularCharacter.substring(index+1));
        System.out.println(result);
    }
    
}
