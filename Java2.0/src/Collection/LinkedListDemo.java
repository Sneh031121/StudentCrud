package Collection;
import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();

        // 1. add() -
        l.add("Snehal");
        l.add(30);
        l.add(null);
        l.add("Patil");
        System.out.println(l);

        // 2. set() - Replaces the element at the specified position
        l.set(0, "software"); // Replaces the element at index 0 with "software"
        System.out.println(l); // Output: [software, 30, null, Patil]


        // 3. removeLast() - Removes the last element of the list
        l.removeLast();      // Removes the last element ("Patil")
        System.out.println(l); // Output: [Venky, 30, null]

        // 4. addFirst() - Adds an element at the beginning of the list
        l.addFirst("vvv");  // Adds "vvv" at the beginning
        System.out.println(l); // Output: [vvv, Venky, 30, null]

        // 5. addLast() - Adds an element at the end of the list
        l.addLast("lastElement");  // Adds "lastElement" at the end
        System.out.println(l); // Output: [vvv, Venky, 30, null, lastElement]

        // 6. removeFirst() - Removes the first element from the list
        l.removeFirst();    // Removes "vvv"
        System.out.println(l); // Output: [Venky, 30, null, lastElement]

        // 7. get() - Retrieves the element at the specified index
        System.out.println(l.get(1)); // Output: 30 (Element at index 1)

        // 8. contains() - Checks if the list contains the specified element
        System.out.println(l.contains("Venky"));  // Output: true
        System.out.println(l.contains("xyz"));   // Output: false

        // 9. indexOf() - Finds the index of the first occurrence of the element
        System.out.println(l.indexOf("null"));  // Output: 2 (Index of null)

        // 10. size() - Returns the number of elements in the list
        System.out.println("Size of LinkedList: " + l.size());  // Output: 4

        // 11. clear() - Removes all elements from the list
        l.clear();   // Clears all elements from the list
        System.out.println(l); // Output: []

        // 12. offer() - Adds an element to the end of the list (same as add())
        l.offer("Suyog"); // Adds "added" at the end
        System.out.println(l); // Output: [Suyog]

        //13.peekfirst() -
        l.peekFirst();
        System.out.println(l);

        //14.peeklast() -
        l.peekLast();
       System.out.println(l);
    }
}

