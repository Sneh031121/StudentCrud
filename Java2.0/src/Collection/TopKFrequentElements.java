package Collection;

    import java.util.*;

    public class TopKFrequentElements {
        public static void main(String[] args) {
            // Input list and value for k
            List<Integer> list = new ArrayList<>(Arrays.asList(4, 4, 1, 2, 2, 2, 3, 3));
            int k = 2;

            // Call the method to get top K frequent elements
            List<String> result = getTopKFrequent(list, k);

            // Print the result
            for (String res : result) {
                System.out.println(res);
            }
        }

        public static List<String> getTopKFrequent(List<Integer> list, int k) {
            // Step 1: Count frequencies using a HashMap
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : list) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            // Step 2: Sort the map entries by frequency (value)
            List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
            entryList.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue()); // Sort by value in descending order

            // Step 3: Collect the top K frequent elements
            List<String> topKElements = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                Map.Entry<Integer, Integer> entry = entryList.get(i);
                topKElements.add(entry.getKey() + " → " + entry.getValue() + " times");
            }

            return topKElements;
        }
    }

