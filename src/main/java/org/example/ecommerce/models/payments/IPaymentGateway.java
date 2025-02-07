package org.example.ecommerce.models.payments;

public interface IPaymentGateway {
    boolean processPayment(double amount);
}
