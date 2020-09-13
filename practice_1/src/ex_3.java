import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ex_3 {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        for (double i = 1; i <= 10; i++)
            System.out.println("[" + i + "]: " + formatter.format(1 / i));
    }
}
