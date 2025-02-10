package org.example.ecommerce.decorators;

public class BasicOrder implements OrderComponent{
    private final double baseCost;
    public BasicOrder(double baseCost){
        this.baseCost = baseCost;
    }
    @Override
    public double getCost() {
        return baseCost;
    }

    @Override
    public String getDescription() {
        return "Basic order";
    }
}
