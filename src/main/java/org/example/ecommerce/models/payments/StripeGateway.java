package org.example.ecommerce.models.payments;

public class StripeGateway implements IPaymentGateway{

    @Override
    public void processPayment(double amount){
        System.out.println("Processing payment via Stripe: $" + amount);

    }
}
