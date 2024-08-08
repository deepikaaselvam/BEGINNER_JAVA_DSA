package HashMappp;
import java.util.HashMap;
public class Chat {
     public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        // Adding key-value pairs to the HashMap
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        // Retrieving a value by key
        int value = map.get("banana");
        System.out.println("Value for key 'banana': " + value);
        // Iterating over the HashMap
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        // int x='a';
        // System.out.println(x+" ");
        HashMap<Character,Integer> mpp=new HashMap<>();
        mpp.put('a',97);
        mpp.put('b',98);
        mpp.put('s',null);
        mpp.put(null,null);
        mpp.put(null,null);
        mpp.put(null,null);
        System.out.println(mpp);
    }
}

    

