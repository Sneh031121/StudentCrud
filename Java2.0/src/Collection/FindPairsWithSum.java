package Collection;
import java.util.HashSet;

public class FindPairsWithSum {

    public static void findPairsWithSum(int[] arr, int targetSum) {
        HashSet<Integer> complements = new HashSet<>();

        for (int num : arr) {
            int complement = targetSum - num;
            if (complements.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            complements.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7};
        int targetSum = 7;
        findPairsWithSum(arr, targetSum);
    }
}
