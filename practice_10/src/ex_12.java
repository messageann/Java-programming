import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        odd();
    }

    public static void odd() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) return;
        if (n%2 != 0) {
            System.out.println(n);
            odd();
        }
        else odd();
    }
}