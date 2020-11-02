import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        System.out.println("Quantity of ones: " + quantityOfOnes());
    }

    static int zeros = 0, counter = 0;
    public static int quantityOfOnes() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            zeros++;
            if (zeros == 2) return counter;
            else return quantityOfOnes();
        }
        else {
            zeros = 0;
            if (n == 1) counter++;
            return quantityOfOnes();
        }
    }
}
