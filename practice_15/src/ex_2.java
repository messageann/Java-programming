import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ex_2 {
    public static void main (String[] args) {
        LinkedList<String> test = new LinkedList<String>();
        test.add("ring");
        test.add("ring");
        test.add("banana phone");
        test.add(2, "ring");
        System.out.println("Example: " + test + "\n");

        LinkedList<String> test_copy = (LinkedList<String>) test.clone();
        test.clear();
        System.out.println("New array: " + test_copy + "\nSize of array: " + test_copy.size()
                + ", old array is empty: " + test.isEmpty());

        test_copy.addFirst("bring");
        System.out.println("\n" + test_copy);
        System.out.println("Array contains 'bring': " + test_copy.contains("bring"));
        System.out.println("2nd element is: " + test_copy.get(1));
        System.out.println("Index of banana phone is " + test_copy.indexOf("banana phone"));
        System.out.println("Last index of ring is " + test_copy.lastIndexOf("ring"));

        test_copy.remove(0);
        System.out.println("\nAfter removal:\n" + test_copy);

    }
}
