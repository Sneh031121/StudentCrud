package Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class CountOccurrences {

    public static void countOccurrences(ArrayList<String> list) {
        // Create a HashMap to store the frequency of each element
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        // Iterate through the ArrayList and update frequencies in the map
        for (String element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Print the occurrences of each element
        for (String key : frequencyMap.keySet()) {
            System.out.println(key + " → " + frequencyMap.get(key));
        }
    }

    public static void main(String[] args) {
        // Example input
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("apple");

        // Call the function to count occurrences
        countOccurrences(list);
    }
}
