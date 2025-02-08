package org.example.ecommerce.models.orders;

public interface OrderObserver {
    void update(OrderStatus status);
}
