package Hashing;

import java.util.HashMap;
import java.util.Map;

public class BasicHashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();


        map.put("apple", 2);
        map.put("banana", 5);
        map.put("cherry", 7);


        System.out.println("Bananas: " + map.get("banana"));


        System.out.println("Has apple? " + map.containsKey("apple"));


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
