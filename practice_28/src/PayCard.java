public class PayCard implements Strategy{
    private Card card;

    @Override
    public void paymentDetails() {
        String number = "1234 3456 4567 6789";
        String date = "05/35";
        String cvv = "000";
        card = new Card(number, date, cvv);
    }

    @Override
    public boolean pay(int sum) {
        if (cardIsPresent()) {
            System.out.println("Оплачено " + sum);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
