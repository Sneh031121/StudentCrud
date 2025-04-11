package Collection;
import java.util.ArrayList;
import java.util.HashMap;

public class FirstNonRepeatingElement {

    public static Integer findFirstNonRepeatingElement(ArrayList<Integer> list) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the HashMap with frequencies
        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the list to find the first non-repeating element
        for (Integer num : list) {
            if (frequencyMap.get(num) == 1) {
                return num; // Return the first non-repeating element
            }
        }

        // If no non-repeating element is found, return null or an appropriate value
        return null;
    }

    public static void main(String[] args) {
        // Test input
        ArrayList<Integer> list = new ArrayList<>();
        list.add(199);
        list.add(189);
        list.add(179);
        list.add(199);
        list.add(189);
        list.add(149);

        // Find and print the first non-repeating element
        Integer result = findFirstNonRepeatingElement(list);
        if (result != null) {
            System.out.println("The first non-repeating element is: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}
