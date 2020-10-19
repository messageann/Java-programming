import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(n + " = ");
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n != 1) System.out.println(n);
    }
}
