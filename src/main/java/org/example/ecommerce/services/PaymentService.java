package org.example.ecommerce.services;

import org.example.ecommerce.models.payments.IPaymentGateway;

public class PaymentService {
    private final IPaymentGateway paymentGateway;

    PaymentService(IPaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    public void makePayment(double amount){
        paymentGateway.processPayment(amount);
    }
}
