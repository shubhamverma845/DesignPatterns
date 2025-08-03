package strategy.payment;

public class UpiPaymentStrategy implements PaymentStrategy {
    @Override
    public void doPayment(int amount) {
        System.out.println("Paying with UPI");
    }
}
