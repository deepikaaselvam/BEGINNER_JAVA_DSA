package StringsConcept;
public class DivideHash {
    public static String hashDividedString(String s, int k) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
        
        // Iterate through each substring
        for (int i = 0; i < n; i += k) {
            int sum = 0;
            // Process each character in the current substring
            for (int j = i; j < i + k; j++) {
                // Convert character to its position in the alphabet (0-based)
                sum += s.charAt(j) - 'a';
            }
            // Find the hashed character
            char hashedChar = (char) (('a'+sum % 26));
            // Append to the result
            result.append(hashedChar);
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
        String str="abcd";
        int length=2;
        String answer=hashDividedString(str,length);
        System.out.print(answer+" ");

    }



    
}
