package org.example.ecommerce.models.discounts;

public class FixedDiscount implements DiscountStrategy{
    private final double discountAmount;

    public FixedDiscount(double discountAmount){
        this.discountAmount = discountAmount;
    }


    @Override
    public double applyDiscount(double price) {
        return price - discountAmount;
    }
}
