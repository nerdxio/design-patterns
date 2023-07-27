package io.nerd.decorator;

//BaseDecorator
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    @Override
    public abstract String getDescription();

}
