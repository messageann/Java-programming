import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayQ <Integer> test = new ArrayQ<>();
        test.enqueue(5);
        test.enqueue(4);
        test.enqueue(3);
        System.out.println(test.getElement());
        System.out.println(test.size());
        System.out.println(test.dequeue());
        System.out.println(test.getElement());
        System.out.println(test.size());
        test.clear();
        System.out.println(test.isEmpty());
        try {
            System.out.println(test.getElement());
        } catch(Exception e) {
            System.out.println("null\n");
        }

        ListQ <Integer> test2 = new ListQ<>();
        test.enqueue(5);
        test.enqueue(4);
        test.enqueue(3);
        System.out.println(test.getElement());
        System.out.println(test.size());
        System.out.println(test.dequeue());
        System.out.println(test.getElement());
        System.out.println(test.size());
        test.clear();
        System.out.println(test.isEmpty());
        try {
            System.out.println(test.getElement());
        } catch(Exception e) {
            System.out.println("null");
        }
    }
}
