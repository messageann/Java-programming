import java.util.Scanner;

public class ex_15 {
    public static void main(String[] args) {
        output();
    }

    public static void output() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n);
    }

    public static int print(int n) {
        if (n<10) {
            System.out.println(n);
            return 0;
        }
        else {
            System.out.print(n%10 + " ");
            return print(n / 10);
        }
    }
}
