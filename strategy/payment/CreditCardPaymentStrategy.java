package strategy.payment;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void doPayment(int amount) {
        System.out.println("Paying with Credit Card");
    }
}
