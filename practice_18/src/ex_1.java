import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        String intString = s.next();
        int i = Integer.parseInt(intString);
        try {
            System.out.println(2 / i);
        }
        catch (Exception e) {
            System.out.println("Exception! " + e.getMessage());
        }
        finally {
            System.out.println("Finally block. Here code executes after try catch-block");
        }
    }
}
