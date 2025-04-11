package Collection;
import java.util.*;

public class RemoveString {

        public static void main(String[] args) {

            ArrayList<String> list = new ArrayList<>();
            list.add("a");
            list.add("ab");
            list.add("abc");
            list.add("java");
            list.add("is");
            list.add("fun");
            list.add("ok");
            list.add("yes");


            // Remove all strings with length less than 3
            list.removeIf(s -> s.length() < 3);

            // Print the result
            System.out.println(list);
        }
    }

