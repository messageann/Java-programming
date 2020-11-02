import java.util.Scanner;

public class ex_16 {
    public static void main(String[] args) {
        quantityOfMax();
    }

    static int counter = 0, max = -1;
    public static void quantityOfMax() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            System.out.println("Max number " + max + " met " + counter + " times");
            return;
        }
        if (n > max) {
            max = n;
            counter=1;
            quantityOfMax();
        }
        else if (n == max) {
            counter++;
            quantityOfMax();
        }
        else quantityOfMax();
    }
}
