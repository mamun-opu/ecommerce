package org.example.ecommerce.models.discounts;

public class PercentageDiscount implements DiscountStrategy{
    private final double percentage;

    public PercentageDiscount(double percentage){
        this.percentage = percentage;
    }


    @Override
    public double applyDiscount(double price) {
        return price - (price * percentage);
    }
}
