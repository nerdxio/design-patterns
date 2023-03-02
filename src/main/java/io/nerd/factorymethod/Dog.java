package io.nerd.factorymethod;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }
}
