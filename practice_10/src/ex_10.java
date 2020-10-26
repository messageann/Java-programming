import java.util.Arrays;
import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        reverseOfNumber();
    }

    public static void reverseOfNumber() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = counter(n, 0);
        int num = (int)Math.pow(10, c-1);
        System.out.println(rvrs(n, num, 0));

    }
    public static int rvrs(int n, int num, int res) {
        if (n<10) {
            res += n;
            return res;
        }
        else {
            res += (n%10)*num;
            return rvrs ((n-n%10)/10, num/10, res);
        }
    }

    public static int counter(int n, int k) {
        if (n < 10)  return k+1;
        return counter(n/10, k+1);
    }
}
