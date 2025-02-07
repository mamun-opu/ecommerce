package org.example.ecommerce.models.payments;

public interface IPaymentGateway {
    void processPayment(double amount);
}
