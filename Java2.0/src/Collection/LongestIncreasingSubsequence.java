package Collection;
import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

    public static List<Integer> longestIncreasingSubsequence(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return new ArrayList<>();
        }

        int n = nums.size();
        int[] dp = new int[n];
        int[] parent = new int[n]; // To help reconstruct the sequence
        int maxLength = 1, maxIndex = 0;

        // Initialize dp array: every element starts as a subsequence of length 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            parent[i] = -1; // No parent for the start of a subsequence
        }

        // DP loop to find the length of LIS ending at each element
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums.get(i) > nums.get(j) && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j; // Update parent to reconstruct the sequence later
                }
            }
            // Track the index of the maximum length
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                maxIndex = i;
            }
        }

        // Backtrack to reconstruct the LIS
        List<Integer> lis = new ArrayList<>();
        int currentIndex = maxIndex;
        while (currentIndex != -1) {
            lis.add(0, nums.get(currentIndex)); // Insert at the beginning of the list
            currentIndex = parent[currentIndex];
        }

        return lis;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(9);
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(7);
        nums.add(101);
        nums.add(18);

        List<Integer> lis = longestIncreasingSubsequence(nums);
        System.out.println("Longest Increasing Subsequence: " + lis);
    }
}
