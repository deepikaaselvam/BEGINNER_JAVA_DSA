package BruteForce;
import java.util.HashMap;
import java.util.Map;
public class Hash3{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 1, 3, 2, 4};
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
            
        }
       

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            
        }
    }
}

