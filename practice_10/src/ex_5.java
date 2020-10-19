import java.util.Scanner;

public class ex_5 {
    public static int Summary(int n, int sum) {
        if (n < 10)  return sum+n;
        return Summary(n/10, sum += n%10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print (Summary(n, 0));
    }
}