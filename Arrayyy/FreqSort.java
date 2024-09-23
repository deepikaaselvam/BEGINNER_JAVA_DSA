package Arrayyy;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
public class FreqSort {
    public static void main(String[] args) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int[]array={1,2,2,3,4,5,5};
        for(int i=0;i<array.length;i++)
        {
           mpp.put(array[i],mpp.getOrDefault(array[i],0)+1);
        }
        System.out.println(mpp);
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(mpp.entrySet());
        System.out.println(entryList);
        // Step 3: Sort the entries by frequency (value) in ascending order
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return a.getValue() - b.getValue(); // Ascending order by frequency
            }
        });
        // Step 4: Print elements and their frequencies in ascending order of frequency
        for (Map.Entry<Integer, Integer> entry : entryList) {
            System.out.println("Element: " + entry.getKey() +" , Count: " + entry.getValue());
        }
    }
    
}
