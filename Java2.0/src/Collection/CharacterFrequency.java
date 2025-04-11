package Collection;
import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "BananA".toUpperCase();


        // Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Loop through the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If the character is already in the map, increment its frequency
            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c) + 1);
            } else {
                // If the character is not in the map, add it with a frequency of 1
                freqMap.put(c, 1);
            }
        }

        // Print the frequency of each character
        for (Character key : freqMap.keySet()) {
            System.out.println(key + ": " + freqMap.get(key));
        }
    }
}
