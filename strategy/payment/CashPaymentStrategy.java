package strategy.payment;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void doPayment(int amount) {
        System.out.println("Paying with Cash");
    }
}
