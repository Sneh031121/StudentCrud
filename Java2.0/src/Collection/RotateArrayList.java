package Collection;
import java.util.ArrayList;
import java.util.List;

public class RotateArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int k = 2;

        List<Integer> rotatedList = rotateList(list, k);
        System.out.println(rotatedList);
    }

    public static List<Integer> rotateList(List<Integer> list, int k) {
        int n = list.size();


        if (n == 0 || k == 0) {
            return list;
        }

        // Use modulo to handle cases where k is greater than the size of the list
        k = k % n;

        // Rotate using sublist
        List<Integer> rotated = new ArrayList<>();

        // Add the last k elements first
        rotated.addAll(list.subList(n - k, n));

        // Add the first n - k elements
        rotated.addAll(list.subList(0, n - k));

        return rotated;
    }
}
