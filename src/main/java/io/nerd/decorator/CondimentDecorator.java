package io.nerd.decorator;

//BaseDecorator
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();

}
