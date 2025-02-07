package org.example.ecommerce.models.payments;

public class PayPalGateway implements IPaymentGateway {
    @Override
    public boolean processPayment(double amount){
        System.out.println("Processing payment via PayPal: $" + amount);
        return true;
    }
}
