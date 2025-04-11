package Collection;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(10);
        inputList.add(20);
        inputList.add(10);
        inputList.add(30);
        inputList.add(20);
        inputList.add(40);

        // Result ArrayList to store unique values
        ArrayList<Integer> uniqueList = new ArrayList<>();

        // Iterate through the original list
        for (Integer num : inputList) {
            // If the number is not already in the unique list, add it
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        System.out.println(uniqueList);
    }
}

