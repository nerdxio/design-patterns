package io.nerd.decorator;

//Component
public abstract class Beverage {
    String description ="Unknown description";
    public String getDescription(){
        return description;
    }
    public abstract double getCost();
}
