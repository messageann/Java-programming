package Calculator;

import java.io.IOException;

public class Operations extends CalculatorController {
        static int sum () {
            int a = calc.values.pop();
            int b = calc.values.pop();
            return a + b;
        }

        static int sub () {
            int a = calc.values.pop();
            int b = calc.values.pop();
            return b-a;
        }

        static int multi () {
            int a = calc.values.pop();
            int b = calc.values.pop();
            return a*b;
        }

        static int div () {
            int a = calc.values.pop();
            int b = calc.values.pop();
            return b/a;
        }
}
