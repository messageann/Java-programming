package Calculator;

import java.util.Scanner;

public class CalculatorView {
    private CalculatorController calcont;

    public CalculatorView () {
        calcont = new CalculatorController();
    }

    void begin() {
        Scanner c = new Scanner(System.in);
        String str = c.nextLine();
        int x;
        char op;
        while (!str.equals(" ")) {
            try {
                x = Integer.parseInt(str);
                calcont.add(x);
            } catch (NumberFormatException ex) {
                if (str.length() == 1) {
                    op = str.charAt(0);
                    calcont.operation(op);
                }
                else System.out.println("error");
            } finally {
                str = c.nextLine();
            }
        }
    }
}
