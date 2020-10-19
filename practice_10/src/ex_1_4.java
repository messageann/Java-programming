import java.util.Scanner;

public class ex_1_4 {
    public static void main(String[] args) {
        ex_1();
    }

    private static void ex_1() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 1, count = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(k + " ");
            if (count == k) {
                k++;
                count = 1;
            }
            else { count++; }
        }
    }

    private static void ex_2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) System.out.print(i + " ");
    }

    private static void ex_3() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) for (; a<=b; a++) System.out.print(a + " ");
        else for (; a>=b; a--) System.out.print(a + " ");
    }

    private static void ex_4() {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int s = in.nextInt();
        int sum = 0, curr = 0, res = 0;
        for (int i = (int) Math.pow(10, k-1); i < (int) Math.pow(10, k); i++) {
            for (sum = 0, curr = i; curr > 0; sum += curr % 10, curr /= 10);
            if (sum == s) res++;
        }
        System.out.print(res);
    }
}

