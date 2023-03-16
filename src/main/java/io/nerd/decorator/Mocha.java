package io.nerd.decorator;

//ConcreteDecorator
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.description + ", Mocha";
    }
}
