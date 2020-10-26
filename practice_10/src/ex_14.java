import java.util.Scanner;

public class ex_14 {
    public static void main(String[] args) {
        output();
    }

    public static void output() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = counter(n, 0);
        int num = (int) Math.pow(10, c - 1);
        print(n, num);
    }
    public static int print(int n, int num) {
        if (n<10) {
            System.out.println(n);
            return 0;
        }
        else {
            System.out.print(n / num + " ");
            return print(n %= num, num /= 10);
        }
    }

    public static int counter(int n, int k) {
        if (n < 10) return k + 1;
        return counter(n / 10, k + 1);
    }
}
