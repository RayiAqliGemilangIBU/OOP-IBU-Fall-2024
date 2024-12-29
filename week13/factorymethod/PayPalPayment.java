package week13.factorymethod;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment");
        // PayPal payment implementation details go here
    }
}
