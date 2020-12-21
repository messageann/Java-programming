package Calculator;

public class CalculatorController {
    public static CalculatorModel calc;

    public CalculatorController() {
        calc = new CalculatorModel();
    }

    void add(int x) {
        calc.values.push(x);
    }

    void operation(char op) {
        if (calc.values.size() > 1) {
            switch (op) {
                case '+' -> System.out.println(calc.values.push(Operations.sum()));
                case '-' -> System.out.println(calc.values.push(Operations.sub()));
                case '*' -> System.out.println(calc.values.push(Operations.multi()));
                case '/' -> System.out.println(calc.values.push(Operations.div()));
                default -> System.out.println("error");
            }
        } else System.out.println("error");
    }
}
