import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        output();
    }

    public static void output() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = counter(n, 0);
        int num = (int)Math.pow(10, c-1);
        for (int i = 0; i < c; i++) {
            if ((n/num)%2!= 0) {
                System.out.print(n/num + " ");
            }
            n%=num;
            num/=10;
        }
    }


    public static int counter(int n, int k) {
        if (n < 10)  return k+1;
        return counter(n/10, k+1);
    }
}
