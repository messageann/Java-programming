import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Strategy strategy;
        Order order = new Order();

        int paymentMethod = 1;
        switch (paymentMethod) {
            case (1):
                strategy = new PayCard();
                break;
            default:
                strategy = new PayWallet();
                break;
        }
        order.processOrder(strategy);
        order.setTotalCost(5000);

        if (strategy.pay(5000)) {
            System.out.println("Well done");
            order.setClosed();
        }
        else System.out.println("Произошла ошибки");
    }
}
