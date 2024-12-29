package week13.factorymethod;

public class CreditCardPaymentFactory  implements  PaymentFactory{
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
