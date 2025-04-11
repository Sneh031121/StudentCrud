package Collection;

import java.util.ArrayList;

public class MergedArrayList extends ArrayList<Integer> {

    public static void main(String[] args) {
        // Creating and populating List1 and List2
        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(1);
        List1.add(3);
        List1.add(5);
        List1.add(7);

        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(2);
        List2.add(4);
        List2.add(6);
        List2.add(8);

        // Printing List1 and List2
        System.out.println("List1: " + List1);
        System.out.println("List2: " + List2);

        // Merging the two sorted lists
        ArrayList<Integer> MergeList = MergedSortedList(List1, List2);
        System.out.println("Merged List: " + MergeList);
    }

    // Method to merge two sorted ArrayLists into one sorted ArrayList
    public static ArrayList<Integer> MergedSortedList(ArrayList<Integer> List1, ArrayList<Integer> List2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        // Merging the lists using two-pointer technique
        while (i < List1.size() && j < List2.size()) {
            if (List1.get(i) < List2.get(j)) {
                mergedList.add(List1.get(i));
                i++;
            } else {
                mergedList.add(List2.get(j));
                j++;
            }
        }

        // Add remaining elements from List1 (if any)
        while (i < List1.size()) {
            mergedList.add(List1.get(i));
            i++;
        }

        // Add remaining elements from List2 (if any)
        while (j < List2.size()) {
            mergedList.add(List2.get(j));
            j++;
        }

        return mergedList;
    }
}
