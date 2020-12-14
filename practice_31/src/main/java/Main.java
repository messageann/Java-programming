import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Complex z1 = new Complex(3, 7);
        Complex z2 = new Complex(-1, 2);
        System.out.println(z1.toString());
        z1.sumWith(z2);
        System.out.println(z1.toString());
    }
}
