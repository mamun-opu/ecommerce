package org.example.ecommerce.models.payments;

public class StripeGateway implements IPaymentGateway{

    @Override
    public boolean processPayment(double amount){
        System.out.println("Processing payment via Stripe: $" + amount);

        return true;
    }
}
