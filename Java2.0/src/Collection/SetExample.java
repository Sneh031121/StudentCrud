package Collection;

import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        System.out.println("Enter 3 words:");

        for (int i = 0; i < 3; i++) {
            String word = scanner.nextLine();
            hashSet.add(word);
            linkedHashSet.add(word);
            treeSet.add(word);
        }

        // Print HashSet elements
        System.out.println("\nHashSet (unordered):");
        for (String word : hashSet) {
            System.out.println(word);
        }

        // Print LinkedHashSet elements
        System.out.println("\nLinkedHashSet (insertion order):");
        for (String word : linkedHashSet) {
            System.out.println(word);
        }

        // Print TreeSet elements 
        System.out.println("\nTreeSet (sorted order):");
        for (String word : treeSet) {
            System.out.println(word);
        }

        scanner.close();
    }
}
