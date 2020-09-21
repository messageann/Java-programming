package ex_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CircleTest {
    public static void main(String[] args) {
        NumberFormat form = new DecimalFormat("#0.00");

        Circle circle = new Circle(5);
        circle.NewProperties(7);
        System.out.println((circle.Properties()));
        System.out.println("Perimeter: " + form.format(circle.Perimeter()));
        System.out.println("Area: " + form.format(circle.Area()));
    }
}
