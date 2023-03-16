package io.nerd.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        //You can use the concrete components without decorator
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.getCost());

        //other way to do the above example
        var b = new Mocha(new Espresso());
        System.out.println(b.getDescription()+" $"+b.getCost());
    }
}
