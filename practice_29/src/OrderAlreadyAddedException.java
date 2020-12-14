public class OrderAlreadyAddedException extends Exception {
    private InternetOrder<Item> position;
    private int count;

    public OrderAlreadyAddedException() {
    }

    public OrderAlreadyAddedException(InternetOrder<Item> position, int count) {
        this.position = position;
        this.count = count;
    }
}