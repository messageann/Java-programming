import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {
        odd();
    }

    static boolean counter = true;
    public static void odd() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) return;
        if (counter == true) {
            System.out.println(n);
            counter = false;
            odd();
        }
        else {
            counter = true;
            odd();
        }
    }
}
