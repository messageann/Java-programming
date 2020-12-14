public class PayWallet implements Strategy{
    private Wallet wallet;

    @Override
    public void paymentDetails() {
        String numberOfCard = "1234 3456 4567 6789";
        Wallet wallet = new Wallet(numberOfCard);
    }

    @Override
    public boolean pay(int sum) {
        if (walletIsPresent()) {
            System.out.println("Оплачено " + sum);
            return true;
        } else {
            return false;
        }
    }

    private boolean walletIsPresent() {
        return wallet != null;
    }
}
