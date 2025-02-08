package org.example.ecommerce.models.orders;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private OrderStatus status;
    private final List<OrderObserver> observers = new ArrayList<>();

    public Order(String orderId){
        this.orderId = orderId;
        this.status = OrderStatus.PENDING;
    }
    public void addObserver(OrderObserver observer){
        observers.add(observer);
    }
    public void removeObserver(OrderObserver observer){
        observers.remove(observer);
    }
    public void setStatus(OrderStatus status){
        this.status = status;
        notifyObserver();
    }

    private void notifyObserver() {
        for(OrderObserver observer: observers){
            observer.update(status);
        }
    }
}
