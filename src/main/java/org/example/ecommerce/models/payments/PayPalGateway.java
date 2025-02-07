package org.example.ecommerce.models.payments;

public class PayPalGateway implements IPaymentGateway {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing payment via PayPal: $" + amount);
    }
}
