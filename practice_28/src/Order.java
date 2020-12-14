public class Order {
    private int totalCost = 0;
    private int status;

    public Order() { status = 1; }

    public void processOrder(Strategy strategy) {
        strategy.paymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public void setClosed() {
        status = 0;
    }
}
