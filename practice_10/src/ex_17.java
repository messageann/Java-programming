import java.util.Scanner;

public class ex_17 {
    public static void main(String[] args) {
        Max();
    }

    static int max = -1;
    public static void Max() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            System.out.println("Max number is " + max);
            return;
        }
        if (n > max) max = n;
        Max();
    }
}
