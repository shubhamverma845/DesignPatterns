package strategy.payment;

public class DriverCode {

    public static void main(String[] args) {
        MyApplication myApplication = new MyApplication();
        myApplication.setPaymentStrategy(new CashPaymentStrategy());
        myApplication.pay(100);

        myApplication.setPaymentStrategy(new CreditCardPaymentStrategy());
        myApplication.pay(100);

        myApplication.setPaymentStrategy(new UpiPaymentStrategy());
        myApplication.pay(100);
    }
}
