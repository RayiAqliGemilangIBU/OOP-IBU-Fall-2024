package week13.factorymethod;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment");
        // Credit card payment implementation details go here
    }
}
