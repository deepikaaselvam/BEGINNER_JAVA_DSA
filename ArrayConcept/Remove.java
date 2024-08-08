package ArrayConcept;
public class Remove{
    public static int RemoveDupli(int[] RemoveDuplicate) {
        if (RemoveDuplicate.length == 0) return 0;

        int j = 0;
        for (int i = 1; i < RemoveDuplicate.length; i++) {
            if (RemoveDuplicate[i] != RemoveDuplicate[j]) {
                j++;
                RemoveDuplicate[j] = RemoveDuplicate[i];
            }
           
        
        }
        
        // The length of the array without duplicates is j + 1
        return j + 1;
    }

    public static void main(String[] args) {
        int[] RemoveDuplicate = {1, 1, 2, 2, 2, 3, 3};
        int length = RemoveDupli(RemoveDuplicate);
        
        // Print the array without duplicates
        for (int i = 0; i < length; i++) {
            System.out.print(RemoveDuplicate[i] + " ");
           
        }
    }
}
